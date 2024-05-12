package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringStringsStreams {

	/**Write a program that reads a list of strings, converts them to uppercase, 
	 * filters out strings containing the letter 'a', and prints the result sorted alphabetically
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("monitor","keyboard","mouse");
		List<String> result = list.stream().map(s -> s.toUpperCase()).filter(str -> !str.contains("A")).sorted()
				.collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
