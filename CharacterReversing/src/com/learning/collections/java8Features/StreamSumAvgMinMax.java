package com.learning.collections.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamSumAvgMinMax {

	/**Write a program that takes a list of integers and calculates the sum, average, minimum, and maximum values using streams.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,1,0);
		
		List<Integer> list=new ArrayList<Integer>();
		
		  list.add(1); list.add(2); list.add(3); list.add(4);
		 
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		//System.out.println(sum);
		
		OptionalDouble odAvg= list.stream().mapToInt(Integer::intValue).average();
		//System.out.println(od);
		
		OptionalInt oiMin=list.stream().mapToInt(Integer::intValue).min();
		//System.out.println(oiMin);
		
		OptionalInt oiMax=list.stream().mapToInt(Integer::intValue).max();
		//System.out.println(oiMax);
		
		System.out.println("sum is : "+sum);
		System.out.println("Average is :"+(odAvg.isPresent() ? odAvg.getAsDouble():"N/A"));
		System.out.println("Minimum is :"+(oiMin.isPresent() ? oiMin.getAsInt():"N/A"));
		System.out.println("Maximum is :"+(oiMax.isPresent() ? oiMax.getAsInt():"N/A"));
	}

}
