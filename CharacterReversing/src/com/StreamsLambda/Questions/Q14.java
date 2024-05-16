package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Write a Java 8 program to find the second largest number in an integer array.
 * 
 */
public class Q14 {

	public static void main(String[] args) {
		int[] array = {2,8,4,6,7,3,1,9};
		OptionalInt value = Arrays.stream(array).distinct().boxed().sorted((a, b) -> b - a).skip(1)
				.mapToInt(Integer::intValue).findFirst();
		// System.out.println(value);
		value.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println(""));

	}

}
