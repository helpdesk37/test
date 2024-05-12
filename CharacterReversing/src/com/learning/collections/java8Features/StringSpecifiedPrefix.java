package com.learning.collections.java8Features;

import java.util.List;
import java.util.Optional;

/**write a method that takes a list of strings and returns the first string that starts with a specified prefix.
 * Use Optional to handle the case where no such string is found.
 * 
 */
public class StringSpecifiedPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=List.of("book1","pencil","pen");
		Optional<String> fValues=filterCondition(list,"a");
		fValues.ifPresentOrElse(s->System.out.println(""+s), ()->System.out.println("no prefix found"));
	}
	public static Optional<String>filterCondition(List<String> str,String prefix) {
		return str.stream().filter(val->val.startsWith(prefix)).findFirst();
	}

}
