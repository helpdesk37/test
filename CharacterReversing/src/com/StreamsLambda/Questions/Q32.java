package com.StreamsLambda.Questions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class Q32 {

	/**Write a Java 8 program to calculate the age of a person in years given their birthday.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date of birth (dd-MM-yyyy)");
		String dob =scanner.nextLine().trim();
		DateTimeFormatter dobPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(dob, dobPattern);
		int age=getPersonAge(localDate,LocalDate.now());
		System.out.println(age);
	}
		public static int getPersonAge(LocalDate dob,LocalDate currentDate) {
			if (dob!=null && currentDate!=null) {
				return Period.between(dob, currentDate).getYears();
			}else {
			return 0;
			}
		}
}
