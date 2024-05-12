package com.StreamsLambda.Questions;

import java.util.List;
import java.util.stream.Collectors;

/**Given a list of strings, write a Java 8 program to join the strings 
 * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter
 * 
 */
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=List.of("abstraction","polymorphism","exception","multithreading");
		String result=str.stream().collect(Collectors.joining("|", "|", "|"));
		System.out.println(result);
	}

}
