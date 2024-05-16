package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.OptionalDouble;

/**Write a Java 8 program to find the sum and average of all elements in an integer array.
 * 
 */
public class Q16 {

	public static void main(String[] args) {
		int [] num = {9,8,7,6,5,4,3,2,1};
		int sum=getSum(num);
		System.out.println(sum);
		OptionalDouble od= getAverage(num);
		//System.out.println(od);
		if(od.isPresent()) {
			System.out.println(od.getAsDouble());
		}

	}
	public static int getSum(int [] arr) {
		return Arrays.stream(arr).sum();
	}
	
	public static OptionalDouble getAverage(int [] arr) {
		return Arrays.stream(arr).average();
	}

}
