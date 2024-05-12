package com.learning.collections.java8Features.Object;

public class Person {
	public Person(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	private String name;
	private Integer age;
	private String gender;
}
