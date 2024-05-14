package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Write a Java 8 program to merge two unsorted arrays into a single sorted
 * array using the stream API.
 */
public class Q9Q10 {

	public static void main(String[] args) {

		int[] array1 = { 8, 9, 7, 8, 4, 5 };
		int[] array2 = { 1, 9, 2, 1, 0, 2 };
		int[] mergedSort = mergeSort1(array1, array2);
	
		System.out.println(Arrays.toString(mergedSort));
	}

	public static int[] mergeSort1(int[] Array1, int[] Array2) {
		return Stream.concat(Arrays.stream(Array1).boxed(), Arrays.stream(Array2).boxed()).distinct().sorted()
				.mapToInt(Integer::intValue).toArray();
	}

}
