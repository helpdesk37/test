package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java 8 program to sort a given list of strings according to the
 * increasing order of their length.
 */
public class Q15 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "ball", "fan", "op", "a");
		List<String> values = getSortedList(list);
		System.out.println(values);
		

	}
	public static List<String> getSortedList(List<String> list) {
		return list.stream().sorted((a, b) -> Integer.compare(a.length(), b.length()))
				.collect(Collectors.toList());
	}

}
