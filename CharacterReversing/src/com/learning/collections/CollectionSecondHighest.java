package com.learning.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,0,54,32,0,25,71);
		final Integer listValue1=
				list.stream()
							.distinct()
							.sorted((a,b)->Integer.compare(b,a))
							.skip(2).findFirst().orElse(null);
		System.out.println(listValue1);

		List<Double> doubleList=Arrays.asList(22.36,22.51,45.31,36.61,27.35);
		final Double listValue2=doubleList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(listValue2);


	}

}
