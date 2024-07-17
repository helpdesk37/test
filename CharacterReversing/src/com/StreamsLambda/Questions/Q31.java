package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.Optional;

/**
 * Write a Java 8 program to get the last element of an array.
 */
public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		String[] strArray = { "one", "two", "three", "four", "five" };
		System.out.println(getlastelement(intArray));
		System.out.println(getlastelement(strArray));
		System.out.println("----streams------");
		Optional<Integer> getlastelementStream = getlastelementStream(intArray);
		if (getlastelementStream.isPresent()) {
			System.out.println(getlastelementStream.get());
		}
		Optional<String> getlastelementStream2 = getlastelementStream(strArray);
		getlastelementStream2.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println());
	}

	public static <T> T getlastelement(T[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		return arr[arr.length - 1];
	}

	public static <T> Optional<T> getlastelementStream(T[] arr) {
		if (arr == null || arr.length == 0) {
			return Optional.empty();
		}
		return Arrays.stream(arr).reduce((first, second) -> second);
	}
}
