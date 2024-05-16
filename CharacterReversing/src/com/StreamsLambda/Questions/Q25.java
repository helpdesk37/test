package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a Java 8 program to extract duplicate elements from an array.
 */
public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = { 100, 102, 103, 100, 105, 106, 102, 102, 103 };
		List<Integer> list = getDuplicateNums(array);
		System.out.println(list);
	}

	public static <T> List<T> getDuplicateNums(T[] arr) {
		return Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
	}
}
