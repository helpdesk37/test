package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q11 {

	/**Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,5,7,8,9,0,2,4,3,6);
		List<Integer> minNum = getMinimum3Numbers(list);
		System.out.println(minNum);
		List<Integer> maxNum = getMaximum3Numbers(list);
		System.out.println(maxNum);
	}
	public static List<Integer> getMinimum3Numbers(List<Integer> numbers) {
		
		return numbers.stream().sorted().limit(3).collect(Collectors.toList());
	}
	
	public static List<Integer> getMaximum3Numbers(List<Integer> numbers) {
		//return numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		return numbers.stream().sorted((a,b)->(b-a)).limit(3).collect(Collectors.toList());
	}

}
