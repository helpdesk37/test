package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ProjectStatusTbl {
	@Id
	private Integer projectStatusId;
	@OneToOne
	@JoinColumn(name="project_id")
	private Project project;
	@OneToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

}
