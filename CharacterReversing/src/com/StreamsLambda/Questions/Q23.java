package com.StreamsLambda.Questions;

/**
 * Write a Java 8 program to check if a given string is a palindrome using the
 * stream API and lambda expressions.
 * 
 * 
 */
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, A plan,a canal,panama";
		boolean palValue = isPalindrome(str);
		System.out.println(palValue);
	}

	public static boolean isPalindrome(String strValue) {
		String normalString = strValue.chars().filter(Character::isLetter).map(Character::toLowerCase)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		String revString = new StringBuilder(normalString).reverse().toString();
		return normalString.equals(revString);
	}
}
