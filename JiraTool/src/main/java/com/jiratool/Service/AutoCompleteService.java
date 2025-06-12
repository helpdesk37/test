package com.jiratool.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Employee;
import com.jiratool.entity.Project;
import com.jiratool.repo.EmployeeRepository;
import com.jiratool.repo.ProjectRepository;

@Service
public class AutoCompleteService {

	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Project> getProjects(String query) {
		return projectRepository.findByProjectNameContaining(query);
	}
	
	public List<Employee> getReportingManagers(String managerName) {
		return employeeRepository.findByEmployeeNameContaining(managerName);
	}
}
