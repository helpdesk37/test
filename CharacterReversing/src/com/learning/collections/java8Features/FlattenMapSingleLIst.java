package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**r
Implement a program that reads a list of lists of integers and flattens it into a single list.
 * 
 */
public class FlattenMapSingleLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list =Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				);
		List<Integer> flattenedList =list.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Integer Flat Map : "+flattenedList);
		
		List<List<Object>> list1=Arrays.asList(
				Arrays.asList("one","two"),
				Arrays.asList(1,2),
				Arrays.asList(true,false),
				Arrays.asList(1.0,2.0,3.0)
				);
		List<Object> fList=list1.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(fList);
	}
	
	

}
