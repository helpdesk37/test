package com.jiratool.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.RolePermission;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
	List<RolePermission>findByMasterRole_roleId(Long roleId);

}
