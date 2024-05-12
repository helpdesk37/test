package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Implement a program that sorts a list of strings based on their length, shortest to longest

 */
public class SortListStringByLength {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("apple","ball","cat","dog","elephant","horse","a","bb");
		str.sort(Comparator.comparingInt(String::length));
		System.out.println(str);
	}
}
