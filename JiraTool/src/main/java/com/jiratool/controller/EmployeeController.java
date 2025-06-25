package com.jiratool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.EmployeeService;
import com.jiratool.entity.Employee;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/createEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		Employee employee2 = employeeService.createEmployee(employee);
		StringBuilder sb = new StringBuilder();
		sb.append("Successfully saved with Id :");
		return ResponseEntity.status(HttpStatus.CREATED).body(sb.append(employee2.getEmployeeId()));
	}
	@GetMapping("/getAllEmployee")
	public ResponseEntity<?> getAllEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return ResponseEntity.status(HttpStatus.OK).body(allEmployees);
	}
	
}
