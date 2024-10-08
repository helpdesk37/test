package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.Project;
import java.util.List;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findByProjectNameContaining(String projectName);
}
