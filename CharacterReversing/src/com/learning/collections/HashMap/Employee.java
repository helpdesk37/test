package com.learning.collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
private Integer empId;
private String empName;
private String empDep;
public Employee(Integer empId, String empName, String empDep) {
	this.empId = empId;
	this.empName = empName;
	this.empDep = empDep;
}

public static void main(String[] args) {
	
	List<? extends Integer> list = new ArrayList<>();
	Map<Integer,Employee> map = new HashMap<Integer,Employee>();
	Employee emp1 = new Employee(1001,"ONE","IT");
	Employee emp2 = new Employee(1002,"TWO","MECHANICAL");
	Employee emp3 = new Employee(1003,"THREE","ITI");
	map.put(1, emp1);
	map.put(2, emp2);
	map.put(3, emp3);
	for (Map.Entry<Integer,Employee> entry : map.entrySet()) {
		Employee e =entry.getValue();
		System.out.println(entry.getKey()+"==="+e.empId+" "+e.empName+" "+e.empDep);
	}
}
}
