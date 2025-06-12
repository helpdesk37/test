package com.jiratool.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Project;
import com.jiratool.repo.ProjectRepository;

import jakarta.transaction.Transactional;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;

	@org.springframework.transaction.annotation.Transactional
	public Project createProject(Project project) {
		
		return projectRepository.save(project);
	}
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}
	
	public Optional<Project> getProjectById(Long empId) {
		return projectRepository.findById(empId);
	}
	public void SendApproveEmail(String toEmail,String approvalLink) {
		
	}
}
