package com.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] text = {"one","two","three","four"};
		System.out.println(Arrays.toString(text));
		
		List<String> list=new ArrayList<String>();
		for (String str : text) {
			list.add(str);
		}
		System.out.println(list);
	}

}
