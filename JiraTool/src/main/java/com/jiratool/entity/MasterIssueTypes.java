package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasterIssueTypes {
	public Long getIssueTypeId() {
		return issueTypeId;
	}
	public void setIssueTypeId(Long issueTypeId) {
		this.issueTypeId = issueTypeId;
	}
	public String getIssueTypeDescription() {
		return issueTypeDescription;
	}
	public void setIssueTypeDescription(String issueTypeDescription) {
		this.issueTypeDescription = issueTypeDescription;
	}
	@Id
private Long issueTypeId;
private String issueTypeDescription;
}
