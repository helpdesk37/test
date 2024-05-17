package com.StreamsLambda.Questions;

import java.util.Scanner;
import java.util.stream.Stream;

public class Q29 {

	/**
	 * Write a Java 8 program to generate the Fibonacci series.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Approach 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int numVal = scanner.nextInt();
		generateFibnocci(numVal).forEach(s->System.out.print(s));;
	}

	public static Stream<Long> generateFibnocci(int numVal) {
		if (numVal <=0) {
			return Stream.empty();
		}
		return Stream.iterate(new long[] {0,1}, f-> new long[] {f[1],f[0]+f[1]}).limit(numVal).map(f->f[0]);
	}
}
