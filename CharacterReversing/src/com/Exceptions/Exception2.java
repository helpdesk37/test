package com.Exceptions;

import com.Exceptions.CustomClass.CustomException2;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException2();
		} catch (CustomException2 e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
