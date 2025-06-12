package com.jiratool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.AutoCompleteService;
import com.jiratool.entity.Employee;
import com.jiratool.entity.Project;

@CrossOrigin(origins = "*")
@RestController
public class AutoCompleteController {

	@Autowired
	private AutoCompleteService autoCompleteService;
	
	@GetMapping("/autoComplete/projectName")
	public ResponseEntity<?> getProjects(@RequestParam String query) {
		List<Project> projects = autoCompleteService.getProjects(query);
		return ResponseEntity.ok(projects);
	}
	
	@GetMapping("/autoComplete/reportManager")
	public ResponseEntity<?> getReportingManagers(@RequestParam String managerName) {
		List<Employee> projects = autoCompleteService.getReportingManagers(managerName);
		return ResponseEntity.ok(projects);
	}
}
