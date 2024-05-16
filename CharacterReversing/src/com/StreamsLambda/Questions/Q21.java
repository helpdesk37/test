package com.StreamsLambda.Questions;

import java.util.stream.IntStream;

public class Q21 {

	/**
	 * Write a Java 8 program to print the first 10 even numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEvenNumbers();
	}

	public static void getEvenNumbers() {
		IntStream.iterate(2, n -> n + 2).limit(10).forEach(s -> System.out.print(" " + s));
	}
}
