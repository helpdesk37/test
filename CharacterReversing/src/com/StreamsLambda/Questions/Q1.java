package com.StreamsLambda.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {

	/**Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mainList=List.of(1,2,3,4,5,6,7,8,9);
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		even=mainList.stream().filter(str->str%2==0).collect(Collectors.toList());
		System.out.println("Even number is :"+even);
		odd=mainList.stream().filter(str->str%2==1).collect(Collectors.toList());
		System.out.println("odd number is :"+odd);
		
		
	}

}
