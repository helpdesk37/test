package com.StreamsLambda.Questions;

import java.util.Map;
import java.util.stream.Collectors;

public class Q26 {

	/**
	 * Write a Java 8 program to print the duplicate characters in a string.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1112223344";
		// input.chars().forEach(s->System.out.print((char)s));
		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		map.entrySet().stream().filter(c -> c.getValue() > 1)
				.forEach(c -> System.out.println(c.getKey() + " repeated " + c.getValue() + " times"));

	}

}
