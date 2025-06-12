package com.jiratool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.EmailService;
import com.jiratool.Service.ProjectService;
import com.jiratool.entity.Project;

import jakarta.mail.MessagingException;

@CrossOrigin(origins = "*")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private EmailService EmailService;

	@PostMapping("/createProject")
	public ResponseEntity<?> createProject(@RequestBody Project project) {
		if (project.getProjectId() == null) {
			Project project2 = projectService.createProject(project);
			if (project2 != null) {
				try {
					EmailService.sendEmail("sai.sagar@cgslimited.com", "Project Approval Request",
							"sample approval message" + project2.getProjectName(),project2.getReportingManager().getEmployeeName());
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return ResponseEntity.status(HttpStatus.CREATED).body(project2);
		} else if (project.getProjectId() != null) {
			Project project2 = projectService.createProject(project);
			return ResponseEntity.status(HttpStatus.CREATED).body("Updated successfully" + project.getProjectId());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("Failed to save");
	}

	@GetMapping("/getAllProjects")
	public ResponseEntity<?> getAllProjects() {
		List<Project> allProjects = projectService.getAllProjects();
		return ResponseEntity.status(HttpStatus.OK).body(allProjects);
	}

	@GetMapping("/editProject/{id}")
	public Optional<Project> getProjectById(@PathVariable Long id) {
		return projectService.getProjectById(id);
	}

	@PutMapping("/updateProject/{projectId}")
	public ResponseEntity<?> updateProject(@RequestBody Project project, @PathVariable Long projectId) {
		Optional<Project> projectById = getProjectById(projectId);
		project.setProjectId(projectId);
		ResponseEntity<?> project2 = createProject(project);
		return ResponseEntity.status(HttpStatus.OK).body(project2);
	}
}
