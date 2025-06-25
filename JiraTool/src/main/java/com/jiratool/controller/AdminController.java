package com.jiratool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.MasterGenderTableService;
import com.jiratool.Service.RolePermissionService;
import com.jiratool.entity.MasterGenderTable;
import com.jiratool.entity.MasterRole;
import com.jiratool.entity.Modules;
import com.jiratool.entity.RolePermission;
import com.jiratool.entity.Screen;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private RolePermissionService rolePermissionService;
	
	private final MasterGenderTableService masterGenderTableService;
	
	public AdminController(MasterGenderTableService masterGenderTableService) {
		this.masterGenderTableService = masterGenderTableService;
	}
	@PostMapping("/assign-permissons")
	public ResponseEntity<?> assignPermissons(@RequestBody List<RolePermission> rolePermission) {
		for (RolePermission rolePermission2 : rolePermission) {
			rolePermissionService.saveRolePermisson(rolePermission2);
		}
		return ResponseEntity.ok("Permissions assigned successfully");
	}
	@GetMapping("/permission/{roleId}")
	public ResponseEntity<List<RolePermission>> getPermissions(@PathVariable Long roleId) {
		return ResponseEntity.ok(rolePermissionService.getPermissonByRoleId(roleId));
	}
	
	@GetMapping("/master/roles")
	public ResponseEntity<List<MasterRole>> getMasterRoles(){
		return ResponseEntity.ok(rolePermissionService.getMasterRoles());
	}
	
	@GetMapping("/master/modules")
	public ResponseEntity<List<Modules>> getMasterModules(){
		return ResponseEntity.ok(rolePermissionService.getMasterModules());
	}
	
	@GetMapping("/master/screens")
	public ResponseEntity<List<Screen>> getScreens(){
		return ResponseEntity.ok(rolePermissionService.getMasterScreens());
	}
	
}
