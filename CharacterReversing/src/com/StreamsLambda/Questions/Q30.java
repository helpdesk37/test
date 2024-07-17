package com.StreamsLambda.Questions;

import java.util.stream.IntStream;

/**
 * Write a Java 8 program to print the first 10 odd numbers.
 */
public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		getOddNumbersApproach1();
		System.out.println("----Approach 2------");
		getOddNumbersApproach2();

	}

	public static void getOddNumbersApproach1() {
		for (int i = 1, count = 0; count < 10; i += 2, count++) {
			System.out.println(i);
		}
	}

	public static void getOddNumbersApproach2() {
		IntStream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
	}
}
