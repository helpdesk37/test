package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that takes a list of integers and returns a new list containing only the even numbers, squared
 */
public class JF1StreamLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenNums=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		List<Integer> sqrnums=list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println(sqrnums);

	}

}
