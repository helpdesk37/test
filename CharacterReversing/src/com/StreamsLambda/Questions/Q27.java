package com.StreamsLambda.Questions;

import java.util.Optional;

import com.StreamsLambda.Questions.Object.SeenCharacterFilter;

/**
 * Write a Java 8 program to find the first repeated character in a string
 */
public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		Optional<Character> first = str.chars().mapToObj(c -> (char) c).filter(new SeenCharacterFilter()).findFirst();
		first.ifPresent(character -> System.out.println(character));
	}

}
