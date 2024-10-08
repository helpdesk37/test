package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PriorityLevel {

	@Id
	private Long priorityLevelId;
	private String priorityDescription;
	public Long getPriorityLevelId() {
		return priorityLevelId;
	}
	public void setPriorityLevelId(Long priorityLevelId) {
		this.priorityLevelId = priorityLevelId;
	}
	public String getPriorityDescription() {
		return priorityDescription;
	}
	public void setPriorityDescription(String priorityDescription) {
		this.priorityDescription = priorityDescription;
	}
}
