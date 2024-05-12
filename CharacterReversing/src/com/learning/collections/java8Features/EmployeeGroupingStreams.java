package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learning.collections.java8Features.Object.Employee;

public class EmployeeGroupingStreams {

	public static void main(String[] args) {
		List<Employee> emp=Arrays.asList(
				new Employee(1001,"rameh","IT"),
				new Employee(1002,"rohit","IT"),
				new Employee(1003,"raju","MECHANICAL"),
				new Employee(1004,"deepa","MECHANICAL"),
				new Employee(1005,"rohini","ELECTRICAL"),
				new Employee(1006,"varsha","ELECTRICAL"),
				new Employee(1007,"vamshi","Accounts"),
				new Employee(1008,"rakhsit","Accounts")
				);

		Map<String,List<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getEmployeeDepartment));
		map.forEach((employeeDepartment,dep)->{
			System.out.println(employeeDepartment);
			dep.forEach(Employee->System.out.println(Employee.getEmployeeId()+"-"+Employee.getEmployeeName()));
		});
	}

}
