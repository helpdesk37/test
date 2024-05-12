package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
 */
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,4,6,7,8);
		
		/* Approach 1 */
		OptionalInt oi=list.stream().mapToInt(Integer::intValue).min();
		//System.out.println(oi);
		
		/* Approach 2 */
		Optional<Integer> minvalue=list.stream().min(Integer::compareTo);
		minvalue.ifPresentOrElse(s->System.out.println("Min Value : "+minvalue.get()), ()->System.out.println("no data found"));
	
		/* Approach 1 */
		OptionalInt ot=list.stream().mapToInt(Integer::intValue).max();
		//System.out.println(ot);
		
		/* Approach 2 */
		Optional<Integer> value=list.stream().max(Integer::compareTo);
		//System.out.println(value);
		value.ifPresentOrElse(s->System.out.println("Max Value : "+value.get()), ()->System.out.println("no data found"));
	}

}
