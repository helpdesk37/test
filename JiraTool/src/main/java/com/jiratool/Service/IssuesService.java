package com.jiratool.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Issues;
import com.jiratool.entity.MasterIssueTypes;
import com.jiratool.entity.PriorityLevel;
import com.jiratool.repo.IssuesRepository;
import com.jiratool.repo.MasterIssueTypesRepository;
import com.jiratool.repo.PriorityLevelRepository;

@Service
public class IssuesService {
	
	@Autowired
	private IssuesRepository issuesRepository;
	@Autowired
	private MasterIssueTypesRepository masterIssueTypesRepository;
	@Autowired
	private PriorityLevelRepository priorityLevelRepository;

	public Issues createIssue(Issues issues) {
		return issuesRepository.save(issues);
	}
	public List<MasterIssueTypes> getMasterIssueTypes() {
		return masterIssueTypesRepository.findAll();
	}
	public List<Issues> getAllIssues(){
		return issuesRepository.findAll();
	}
	public List<PriorityLevel> getPriorityLevels() {
		return priorityLevelRepository.findAll();
	}
}
