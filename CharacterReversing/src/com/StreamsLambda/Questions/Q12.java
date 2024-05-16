package com.StreamsLambda.Questions;

public class Q12 {

	/**
	 * Write a Java 8 program to check if two strings are anagrams or not using the
	 * stream API and lambda expressions.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen";
		String s2 = "Silent";
		boolean checkValue = checkAnagram(s1, s2);
		System.out.println(" " + checkValue);
	}

	public static boolean checkAnagram(String str1, String str2) {
		String normString1 = normalizeString(str1);
		String normString2 = normalizeString(str2);
		// System.out.println(normString1);
		// System.out.println(normString2);
		String sortString1 = sortString(normString1);
		// System.out.println(sortString1);
		String sortString2 = sortString(normString2);
		// System.out.println(sortString2);
		return sortString1.equals(sortString2);
	}

	public static String normalizeString(String str) {
		return str.chars().filter(Character::isLetter).map(Character::toLowerCase)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public static String sortString(String sortstr) {
		return sortstr.chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

}
