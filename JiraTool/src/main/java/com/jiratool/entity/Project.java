package com.jiratool.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 //@SequenceGenerator(name = "PROJECTSEQ", sequenceName = "my_sequence_name", allocationSize = 1)
	private Long projectId;
	private String projectName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee reportingManager;
	@CreatedDate
	private Date createDate;
	@Column(columnDefinition = "TINYINT DEFAULT 0")
	private Byte ApprovedFlag;
	public Byte getApprovedFlag() {
		return ApprovedFlag;
	}
	public void setApprovedFlag(Byte approvedFlag) {
		ApprovedFlag = approvedFlag;
	}
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
