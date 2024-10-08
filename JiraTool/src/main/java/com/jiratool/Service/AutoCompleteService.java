package com.jiratool.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Project;
import com.jiratool.repo.ProjectRepository;

@Service
public class AutoCompleteService {

	@Autowired
	private ProjectRepository projectRepository;
	public List<Project> getProjects(String query) {
		return projectRepository.findByProjectNameContaining(query);
	}
}
