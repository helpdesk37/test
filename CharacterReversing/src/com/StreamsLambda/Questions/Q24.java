package com.StreamsLambda.Questions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, write a Java 8 program to find the strings that
 * start with a number.
 */
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("123abc", "zyxs123", "56test");
		List<String> str = getStringNumber(list);
		System.out.println(str);
	}

	public static List<String> getStringNumber(List<String> str) {
		return str.stream().filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0))).collect(Collectors.toList());
	}

}
