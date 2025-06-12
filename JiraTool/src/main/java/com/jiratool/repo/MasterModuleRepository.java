package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.Modules;

public interface MasterModuleRepository extends JpaRepository<Modules, Long> {

}
