package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q22 {

	/**
	 * Write a Java 8 program to find the most repeated element in an array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listArray = { 1, 7, 6, 2, 2, 3, 3, 3, 3, 4, 4, 8, 5, 5 };
		int repValue = getRepeatedElement(listArray);
		String[] strArray = { "one", "one", "one", "two", "three", "four", "five", "five" };
		String repString = getRepeatedString(strArray);
		System.out.println(repValue);
		System.out.println(repString);
	}

	public static int getRepeatedElement(int[] array) {
		return Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.orElseThrow(() -> new RuntimeException("Array is empty"));
	}

	public static String getRepeatedString(String[] str) {
		return Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.orElseThrow(() -> new RuntimeException("Array is empty"));
	}
}
