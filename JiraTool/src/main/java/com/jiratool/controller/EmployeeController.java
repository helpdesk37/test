package com.jiratool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.EmployeeService;
import com.jiratool.entity.Employee;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/createEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		Employee employee2 = employeeService.createEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee2);
	}
}
