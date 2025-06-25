package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasterGenderTable {

	@Id
	private Long genderId;
	public Long getGenderId() {
		return genderId;
	}
	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	public String getGenderDescription() {
		return genderDescription;
	}
	public void setGenderDescription(String genderDescription) {
		this.genderDescription = genderDescription;
	}
	private String genderDescription;
}
