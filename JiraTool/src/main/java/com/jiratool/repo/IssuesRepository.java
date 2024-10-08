package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.Issues;

public interface IssuesRepository extends JpaRepository<Issues, Long> {

}
