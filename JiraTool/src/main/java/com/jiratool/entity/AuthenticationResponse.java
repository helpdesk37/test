package com.jiratool.entity;

public class AuthenticationResponse {
private final String jwt;
private UserLogin userLogin;

public UserLogin getUserLogin() {
	return userLogin;
}

public AuthenticationResponse(String jwt,UserLogin userLogin) {
	this.jwt = jwt;
	this.userLogin=userLogin;
}

public String getJwt() {
	return jwt;
}
}
