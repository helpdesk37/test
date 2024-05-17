package com.StreamsLambda.Questions;

import java.util.Scanner;

public class Q29A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int numVal = scanner.nextInt();
		long[] fibnocci = generateFibnocci(numVal);
		for (long l : fibnocci) {
			System.out.print(l);
		}
	}

	public static long[] generateFibnocci(int numVal) {
		long[] series = new long[numVal];
		if (numVal <= 0) {
			return new long[0];
		}
		if (numVal >= 1) {
			series[0] = 0;
		}
		if (numVal >= 2) {
			series[1] = 1;

		}
		for (int i = 2; i <numVal; i++) {
			series[i]=series[i-1]+series[i-2];
			
		}
	//	System.out.println(series[0]);
		return series;
	}
}
