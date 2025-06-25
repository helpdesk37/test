package com.jiratool.dto;

import java.util.List;

import com.jiratool.entity.Modules;

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
	private Long roleId;
	private List<Modules> modules;
	public Long getRoleId() {
		return roleId;
	}
	public List<Modules> getModules() {
		return modules;
	}
	public void setModules(List<Modules> modules) {
		this.modules = modules;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public UserLoginDto(String token, Long userId,Long employeeId,Long roleId) {
		this.token = token;
		this.userId = userId;
		this.employeeId=employeeId;
		this.roleId=roleId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
