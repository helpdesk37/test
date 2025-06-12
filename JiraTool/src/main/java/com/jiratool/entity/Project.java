package com.jiratool.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 //@SequenceGenerator(name = "PROJECTSEQ", sequenceName = "my_sequence_name", allocationSize = 1)
	private Long projectId;
	private String projectName;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee reportingManager;
	@CreatedDate
	private Date createDate;
	public Employee getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(Employee reportingManager) {
		this.reportingManager = reportingManager;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
