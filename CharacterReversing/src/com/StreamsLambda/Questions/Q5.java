package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**Write a Java 8 program to sort a given list of decimal numbers in reverse order.
 * 
 */
public class Q5 {

	public static void main(String[] args) {
		List<Double> list=Arrays.asList(1.5,8.1,3.0,4.1);
		Collections.sort(list, Collections.reverseOrder());
		list.forEach(System.out::println);

	}

}
