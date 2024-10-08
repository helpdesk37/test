package com.jiratool.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.config.JWTUtil;
import com.jiratool.entity.AuthenticationRequest;
import com.jiratool.entity.AuthenticationResponse;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {

	private final AuthenticationManager authenticationManager;
	private final UserDetailsService userDetailsService;
	private final JWTUtil jwtUtil;
	public AuthenticationController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService,
			JWTUtil jwtUtil) {
		this.authenticationManager = authenticationManager;
		this.userDetailsService = userDetailsService;
		this.jwtUtil = jwtUtil;
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)throws Exception {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
		final UserDetails userByUsername = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		final String token = jwtUtil.generateToken(userByUsername);
		return ResponseEntity.ok().body(new AuthenticationResponse(token));
		//return ResponseEntity.ok(null);
	}
	
}
