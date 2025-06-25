package com.jiratool.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

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

/*
 * @ManyToMany(mappedBy = "roles") private Set<UserLogin> user;
 */
}
