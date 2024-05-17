package com.StreamsLambda.Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Write a Java 8 program to find the first non-repeated character in a string.
 */
public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		Optional<Character> nonRepeatedCharacter = getNonRepeatedCharacter(str);
		nonRepeatedCharacter.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println(" "));
	}

	public static Optional<Character> getNonRepeatedCharacter(String input) {
		Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			linkedHashMap.put(ch, linkedHashMap.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
			if (entry.getValue() == 1) {
				return Optional.of(entry.getKey());
			}

		}
		return Optional.empty();
	}
}
