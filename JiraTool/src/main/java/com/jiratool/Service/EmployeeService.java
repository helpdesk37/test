package com.jiratool.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.Employee;
import com.jiratool.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
