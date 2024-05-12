package com.StreamsLambda.Questions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.
 */
public class Q2 {

	public static void main(String[] args) {
		List<Object> list=List.of(1,3,4,2,1,3,4,"text","one","two","one","text");
		list=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);

	}

}
