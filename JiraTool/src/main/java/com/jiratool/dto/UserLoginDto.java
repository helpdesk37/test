package com.jiratool.dto;

public class UserLoginDto {

	private String token;
	private Long userId;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	private Long employeeId;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public UserLoginDto(String token, Long userId,Long employeeId) {
		this.token = token;
		this.userId = userId;
		this.employeeId=employeeId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
