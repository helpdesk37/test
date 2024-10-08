package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.PriorityLevel;

@Repository
public interface PriorityLevelRepository extends JpaRepository<PriorityLevel, Long> {

}
