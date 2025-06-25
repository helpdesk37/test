package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.MasterStatusTable;

public interface MasterStatusTableRepository extends JpaRepository<MasterStatusTable, Long> {

}
