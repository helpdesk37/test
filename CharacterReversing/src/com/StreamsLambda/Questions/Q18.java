package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write a Java 8 program to reverse each word of a given string using the
 * stream API and lambda expressions.
 * 
 * 
 */
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "java";
		String output = reverseWord(text);
		System.out.println(output);
	}

	public static String reverseWord(String input) {
		return Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
	}
}
