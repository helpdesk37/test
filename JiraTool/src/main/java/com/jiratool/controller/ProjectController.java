package com.jiratool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.EmailService;
import com.jiratool.Service.ProjectService;
import com.jiratool.entity.Project;

@CrossOrigin(origins = "*")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	
	@PostMapping("/createProject")
	public ResponseEntity<?> createProject(@RequestBody Project project) {
		Project project2 = projectService.createProject(project);
		if(project2!=null) {
			//projectService.SendApproveEmail();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(project2);
	}

	@GetMapping("/getAllProjects")
	public ResponseEntity<?> getAllProjects() {
		List<Project> allProjects = projectService.getAllProjects();
		return ResponseEntity.status(HttpStatus.OK).body(allProjects);
	}
}
