package com.jiratool.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Project;
import com.jiratool.repo.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}
}
