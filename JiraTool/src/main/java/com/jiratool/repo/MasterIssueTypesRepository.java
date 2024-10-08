package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.MasterIssueTypes;

@Repository
public interface MasterIssueTypesRepository extends JpaRepository<MasterIssueTypes, Long>{

}
