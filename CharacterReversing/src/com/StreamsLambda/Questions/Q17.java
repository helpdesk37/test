package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q17 {

	/**Write a Java 8 program to find the common elements between two arrays using streams
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 9, 1, 7, 3 };
		int[] arr2 = { 8, 2, 4, 6, 1, 7, 3 };
		double[] darr1 = { 25.00, 26.00, 27.01, 28.02 };
		double[] darr2 = { 26.00, 27.00, 28.02, 27.01 };
		Set<?> setintValues = getIntValues(darr2);
		List<?> list=getCommonValues(setintValues);
	//	Set<?> setintValues1 = getIntValues(darr2);
		System.out.println(setintValues);
		System.out.println("common elements are "+list);
		//System.out.println(setintValues1);
		// Set<?> setdoubleValues=getDoubleValues(darr2);
		// Set<Integer> setList =
		// Arrays.stream(arr2).boxed().collect(Collectors.toSet());

		// List<Integer> list =
		// Arrays.stream(arr1).filter(setList::contains).boxed().collect(Collectors.toList());
		// System.out.println(list);

		/* Print commmon elements using Double Data Type */
		// double[] darr1 = { 25.00, 26.00, 27.01, 28.02 };
		// double[] darr2 = { 26.00, 27.00, 28.02, 27.01 };
		// Set<Double> setlist =
		// Arrays.stream(darr2).boxed().collect(Collectors.toSet());

		// List<Double> dlist =
		// Arrays.stream(darr1).filter(setlist::contains).boxed().collect(Collectors.toList());
		// System.out.println(dlist);
	}

	public static Set<?> getIntValues(Object obj) {
		if (obj instanceof int[]) {
			return Arrays.stream((int[]) obj).boxed().collect(Collectors.toSet());
		} else if (obj instanceof double[]) {
			return Arrays.stream((double[]) obj).boxed().collect(Collectors.toSet());
		} else {
			throw new IllegalArgumentException("");
		}
	}
	public static List<?> getCommonValues(Set<?> setintValues) {
		return setintValues.stream().filter(setintValues::contains).collect(Collectors.toList());
	}
}
