package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learning.collections.java8Features.Object.Person;

public class CollectionGroupingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(
				new Person("ramu",21,"Male"),
				new Person("rani",21,"FeMale"),
				new Person("roja",25,"FeMale"),
				new Person("kiran",24,"Male")
				);
		Map<String,List<Person>> map=list.stream().collect(Collectors.groupingBy(Person::getGender));
		map.forEach((gender,group)->{
			System.out.println(gender);
			group.forEach(person->System.out.println("\t"+person.getName()));
		});

	}

}
