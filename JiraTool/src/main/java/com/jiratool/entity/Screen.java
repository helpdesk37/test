package com.jiratool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Screen {

	public Long getScreenId() {
		return screenId;
	}
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	/*
	 * public SubModule getSubModule() { return subModule; } public void
	 * setSubModule(SubModule subModule) { this.subModule = subModule; }
	 */
	public String getScreenDescipton() {
		return screenDescipton;
	}
	public void setScreenDescipton(String screenDescipton) {
		this.screenDescipton = screenDescipton;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long screenId;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="sub_module_id",nullable = false) private SubModule
	 * subModule;
	 */
	private String screenDescipton;
}
