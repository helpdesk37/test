package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasterRole {
	@Id
private Long roleId;
public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleDescrption() {
		return roleDescrption;
	}
	public void setRoleDescrption(String roleDescrption) {
		this.roleDescrption = roleDescrption;
	}
private String roleDescrption;
}
