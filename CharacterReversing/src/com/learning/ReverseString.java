package com.learning;

public class ReverseString {

	public static void main(String[] args) {


		String str = "ABCEDF";
		String reverse ="";
		//System.out.println("before"+str);
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
	
	

}
