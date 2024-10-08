package com.jiratool.config;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTRequestFilter extends OncePerRequestFilter {

	
	  private final JWTUtil jwtUtil; 
	  private final UserDetailsService
	  userDetailsService;
	  
	  public JWTRequestFilter(JWTUtil jwtUtil, UserDetailsService
	  userDetailsService) { this.jwtUtil = jwtUtil; this.userDetailsService =
	  userDetailsService; }
	 

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String header = request.getHeader("Authorization");
		String jwt = null;
		String uName = null;
		if (header != null && header.startsWith("Bearer")) {
			jwt = header.substring(7);
			uName = jwtUtil.extractUserName(jwt);
		}
		if (uName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userByUsername = this.userDetailsService.loadUserByUsername(uName);
			if (jwtUtil.validateToken(jwt, userByUsername)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userByUsername,null,userByUsername.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
		}  
		filterChain.doFilter(request, response);
	}

}
