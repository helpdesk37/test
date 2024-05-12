package com.StreamsLambda.Questions.ExtraLearning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EachWordRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("learning java programms");
		Map<String,Map<Character,Integer>> map = new HashMap<>();
		for (String string : list) {
			String []word=string.split("\\s");
			for (String str : word) {
				Map<Character,Integer> charFreq = new HashMap();
				for (char ch : str.toCharArray()) {
					charFreq.put(ch, charFreq.getOrDefault(ch, 0)+1);
				}
				map.put(str, charFreq);
			}
		}
		System.out.println("===test====");
		map.forEach((str,charFreq)->{
			System.out.println(str+"");
			charFreq.forEach((character,frequency)->{
				System.out.println(character+" "+frequency);
			});
		});
	}// main method loop

}
