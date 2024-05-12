package com.StreamsLambda.Questions;

import java.util.List;
import java.util.stream.Collectors;

/**Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
 * 
 */
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(49,35,56,40,50,27);
		list.stream().filter(str->str%7==0).forEach(System.out::println);
	}

}
