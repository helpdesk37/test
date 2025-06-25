package com.jiratool.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.MasterRole;
import com.jiratool.entity.Modules;
import com.jiratool.entity.RolePermission;
import com.jiratool.entity.Screen;
import com.jiratool.repo.MasterModuleRepository;
import com.jiratool.repo.MasterRoleRepository;
import com.jiratool.repo.MasterScreensRepository;
import com.jiratool.repo.RolePermissionRepository;

@Service
public class RolePermissionService {

	@Autowired
	private RolePermissionRepository rolePermissionRepository;
	
	@Autowired
	private MasterRoleRepository masterRoleRepository;
	
	@Autowired
	private MasterModuleRepository masterModuleRepository;
	
	@Autowired
	private MasterScreensRepository masterScreensRepository;
	
	public List<RolePermission> getPermissonByRoleId(Long roleId) {
		List<RolePermission> byMasterRoleroleId = rolePermissionRepository.findByMasterRole_roleId(roleId);
		Map<Long,Modules> moduleMap=new HashMap<>();
		for (RolePermission rolePermission : byMasterRoleroleId) {
			Long moduleId = rolePermission.getModule().getModuleId();
			Long screenId = rolePermission.getScreen().getScreenId();
			Modules modules=moduleMap.computeIfAbsent(moduleId, id->{
				Modules module = rolePermission.getModule();
				Modules mdo = new Modules();
				mdo.setModuleId(module.getModuleId());
				mdo.setModuleDescription(module.getModuleDescription());
				return mdo;
			});
			Screen screen = rolePermission.getScreen();
			Screen scr = new Screen();
			scr.setScreenId(screen.getScreenId());
			scr.setScreenDescipton(screen.getScreenDescipton());
		}
		
		return rolePermissionRepository.findByMasterRole_roleId(roleId);
	}
	public void saveRolePermisson(RolePermission rolePermission) {
		rolePermissionRepository.save(rolePermission);
	}
	public List<MasterRole> getMasterRoles(){
		return masterRoleRepository.findAll();
	}
	public List<Modules> getMasterModules(){
		return masterModuleRepository.findAll();
	}
	public List<Screen> getMasterScreens(){
		return masterScreensRepository.findAll();
	}
}
