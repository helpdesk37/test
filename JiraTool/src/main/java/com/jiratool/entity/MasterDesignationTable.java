package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasterDesignationTable {

	@Id
	private Long designationId;
	private String designationDescription;
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	public String getDesignationDescription() {
		return designationDescription;
	}
	public void setDesignationDescription(String designationDescription) {
		this.designationDescription = designationDescription;
	}
	
}
