package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Issues {
	@Id
	@GeneratedValue
private Long issueId;
private String projectName;
public MasterIssueTypes getMasterIssueTypes() {
	return masterIssueTypes;
}
public void setMasterIssueTypes(MasterIssueTypes masterIssueTypes) {
	this.masterIssueTypes = masterIssueTypes;
}
@ManyToOne
@JoinColumn(name="issue_type_id")
private MasterIssueTypes masterIssueTypes;
//private String issueType;
public Long getIssueId() {
	return issueId;
}
public void setIssueId(Long issueId) {
	this.issueId = issueId;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}

/*
 * public String getIssueType() { return issueType; } public void
 * setIssueType(String issueType) { this.issueType = issueType; }
 */
public String getIssueSummary() {
	return issueSummary;
}
public void setIssueSummary(String issueSummary) {
	this.issueSummary = issueSummary;
}
private String issueSummary;
private String reporter;
@ManyToOne
@JoinColumn(name="priority_level_id")
private PriorityLevel priorityLevel;

public PriorityLevel getPriorityLevel() {
	return priorityLevel;
}
public void setPriorityLevel(PriorityLevel priorityLevel) {
	this.priorityLevel = priorityLevel;
}

public String getReporter() {
	return reporter;
}
public void setReporter(String reporter) {
	this.reporter = reporter;
}
}
