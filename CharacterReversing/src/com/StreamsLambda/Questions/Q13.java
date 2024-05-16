package com.StreamsLambda.Questions;

public class Q13 {

	/**
	 * Write a Java 8 program to find the sum of all digits of a given number.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers = 3658;
		int sum = sumofNumbers(numbers);

		System.out.println(sum);

	}

	public static int sumofNumbers(int numbers) {
		return String.valueOf(numbers).chars().map(Character::getNumericValue).sum();
	}
}
