package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SubModule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subModuleId;
	private String subModuleDescription;
	@ManyToOne
	@JoinColumn(name="module_id")
	private Modules module;
	public Long getSubModuleId() {
		return subModuleId;
	}
	public void setSubModuleId(Long subModuleId) {
		this.subModuleId = subModuleId;
	}
	public String getSubModuleDescription() {
		return subModuleDescription;
	}
	public void setSubModuleDescription(String subModuleDescription) {
		this.subModuleDescription = subModuleDescription;
	}
	public Modules getModule() {
		return module;
	}
	public void setModule(Modules module) {
		this.module = module;
	}
}
