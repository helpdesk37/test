package com.learning.collections.java8Features.Object;

public class Employee {

	public Employee(Integer employeeId, String employeeName, String employeeDepartment) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}
	private Integer employeeId;
	private String employeeName;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	private String employeeDepartment;
}
