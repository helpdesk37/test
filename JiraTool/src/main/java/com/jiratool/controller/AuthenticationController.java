package com.jiratool.controller;

import java.util.Optional;

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
import com.jiratool.config.MyUserDetails;
import com.jiratool.dto.UserLoginDto;
import com.jiratool.entity.AuthenticationRequest;
import com.jiratool.entity.AuthenticationResponse;
import com.jiratool.entity.UserLogin;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {

	private final AuthenticationManager authenticationManager;
	private final UserDetailsService userDetailsService;
	private final JWTUtil jwtUtil;
	private final MyUserDetails myUserDetails;
	public AuthenticationController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService,
			JWTUtil jwtUtil,MyUserDetails myUserDetails) {
		this.authenticationManager = authenticationManager;
		this.userDetailsService = userDetailsService;
		this.jwtUtil = jwtUtil;
		this.myUserDetails=myUserDetails;
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)throws Exception {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
		final UserDetails userByUsername = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		final String token = jwtUtil.generateToken(userByUsername);
		Optional<UserLogin> userLogin=myUserDetails.getLoginUserDetails(userByUsername.getUsername());
		UserLogin userLogin2 = userLogin.get();
		return ResponseEntity.ok().body(new UserLoginDto(token,userLogin2.getId(),userLogin2.getEmployee().getEmployeeId()));
		//return ResponseEntity.ok(null);
	}
	
}
