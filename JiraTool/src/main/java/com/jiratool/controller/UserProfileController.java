package com.jiratool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.UserProfileService;
import com.jiratool.entity.UserLogin;

@CrossOrigin(origins = "*")
@RestController
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody UserLogin UserLogin) {
		UserLogin.setPassword(bCryptPasswordEncoder.encode(UserLogin.getPassword()));
		com.jiratool.entity.UserLogin user = userProfileService.createUser(UserLogin);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
}
