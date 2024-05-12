package com.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**converting list to array using predefined method in list*/
public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		String [] arr=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));

	}

}
