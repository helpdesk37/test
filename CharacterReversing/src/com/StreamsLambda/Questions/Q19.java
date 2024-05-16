package com.StreamsLambda.Questions;

import java.util.stream.IntStream;

public class Q19 {

	/**
	 * Write a Java 8 program to find the sum of the first 10 natural numbers using
	 * streams.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = getsumNatural(10);
		System.out.println(num);
	}

	public static int getsumNatural(int n) {
		return IntStream.rangeClosed(1, n).sum();
	}
}
