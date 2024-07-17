package com.Exceptions;

import com.Exceptions.CustomClass.CustomException1;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		} catch (CustomException1 e) {
			// TODO: handle exception
			System.out.println(" "+e.getMessage());
		}
	}
	public static void validate(int age) throws CustomException1{
		if(age<18) {
			throw new CustomException1("not eligible");
		}else {
			System.out.println("Eligible");
		}
	}

}
