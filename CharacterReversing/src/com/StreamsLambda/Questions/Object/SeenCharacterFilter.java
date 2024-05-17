package com.StreamsLambda.Questions.Object;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SeenCharacterFilter implements Predicate<Character> {
	private final Set<Character> seen = new HashSet<>();
	@Override
	public boolean test(Character character) {
		// TODO Auto-generated method stub
		if (seen.contains(character)) {
			return true;
		}else {
			seen.add(character);
			return false;
		}
	}

}
