package com.StreamsLambda.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.
 * 
 */
public class Q3Q4 {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("text","one","two","one");
		Map<Character, Long> map = str.stream().flatMapToInt(CharSequence::chars).mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((character,frequency)->System.out.println(character+"=="+frequency));
		
		
		
	}

}
