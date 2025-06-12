package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RolePermission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rolePermissionId;
	@ManyToOne
	@JoinColumn(name="role_id")
	private MasterRole masterRole;
	public Long getRolePermissionId() {
		return rolePermissionId;
	}
	public void setRolePermissionId(Long rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}
	public MasterRole getMasterRole() {
		return masterRole;
	}
	public void setMasterRole(MasterRole masterRole) {
		this.masterRole = masterRole;
	}
	public Modules getModule() {
		return module;
	}
	public void setModule(Modules module) {
		this.module = module;
	}

	/*
	 * public SubModule getSubModule() { return subModule; } public void
	 * setSubModule(SubModule subModule) { this.subModule = subModule; }
	 */
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public boolean isCanCreate() {
		return canCreate;
	}
	public void setCanCreate(boolean canCreate) {
		this.canCreate = canCreate;
	}
	public boolean isCanView() {
		return canView;
	}
	public void setCanView(boolean canView) {
		this.canView = canView;
	}
	@ManyToOne
	@JoinColumn(name="module_id")
	private Modules module;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="sub_module_id",nullable = false) private SubModule
	 * subModule;
	 */
	@ManyToOne
	@JoinColumn(name="screen_id")
	private Screen screen;
	
	@ManyToOne
	@JoinColumn(name="id")
	private UserLogin userLogin;
	
	
	private boolean canCreate;
	public UserLogin getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
	private boolean canView;
}
