package com.StreamsLambda.Questions.ExtraLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStringSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list=Arrays.asList("keyboard","mouse","monitor",1,2,3);
		
		List<String> str=list.stream().filter(obj -> obj instanceof String).map(obj -> (String)obj).collect(Collectors.toList());
		System.out.println(str);
		List<Integer> num1=list.stream().filter(num->num instanceof Integer).map(num->(Integer)num).collect(Collectors.toList());
		System.out.println(num1);
	}

}
