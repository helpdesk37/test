package com.jiratool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jiratool.Service.IssuesService;
import com.jiratool.entity.Issues;
import com.jiratool.entity.MasterIssueTypes;
import com.jiratool.entity.PriorityLevel;

@CrossOrigin(origins = "*")
@RestController
public class IssuesController {

	@Autowired
	private IssuesService issuesService;
	@PostMapping("/createIssue")
	public ResponseEntity<?> createIssue(@RequestParam("issueData") String  issueData,@RequestParam("files") MultipartFile[] files) {
		//Issues issue = issuesService.createIssue(issues);
		ObjectMapper mapper = new ObjectMapper();
		try {
			Issues value = mapper.readValue(issueData, Issues.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("");
	}
	@GetMapping("/getMasterIssueTypes")
	public ResponseEntity<?> getMasterIssueTypes(){
		List<MasterIssueTypes> masterIssueTypes = issuesService.getMasterIssueTypes();
		return ResponseEntity.status(HttpStatus.OK).body(masterIssueTypes);
	}
	
	@GetMapping("/getAllIssues")
	public ResponseEntity<?> getAllIssues() {
		List<Issues> allIssues = issuesService.getAllIssues();
		return ResponseEntity.status(HttpStatus.OK).body(allIssues);
	}
	
	@GetMapping("/getPriorityLevels")
	public ResponseEntity<?> getPriorityLevels() {
		List<PriorityLevel> priorityLevels = issuesService.getPriorityLevels();
		return ResponseEntity.status(HttpStatus.OK).body(priorityLevels);
	}
}
