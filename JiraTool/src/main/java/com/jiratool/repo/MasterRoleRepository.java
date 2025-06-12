package com.jiratool.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.MasterRole;

public interface MasterRoleRepository extends JpaRepository<MasterRole, Long> {
	//Optional<MasterRole> findByName(String name);
}
