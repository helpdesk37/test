package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a Java 8 program to reverse an integer array.
 */
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = { 1, 3, 3, 7 };
		int[] reversedArray = reversedArray(arrayOne);
		System.out.println(Arrays.toString(reversedArray));

	}

	public static int[] reversedArray(int[] array) {
		List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
