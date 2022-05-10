package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringToNumberConversion {

	public static void main(String[] args) {
		// String to Number Conversion -> Note: the String should be convertible value
		//
		
		String str1 = "124"; // Convertible value
		String str2 = "Kaviya1802"; // Non- convertible value
		 
		int strInt = Integer.parseInt(str1);
		float strFloat = Float.parseFloat(str1);
		double strDouble = Double.parseDouble(str1);
		
		System.out.println("Integer: "+strInt);
		System.out.println("Float:"+strFloat);
		System.out.println("Double : "+strDouble);
		
		System.out.println( "Please enter the string value:");
		Scanner input = new Scanner(System.in);
		String str3 = input.next();
		
		int userInt = Integer.parseInt(str3);
		float userFloat = Float.parseFloat(str3);
		double userDouble = Double.parseDouble(str3);
		
		System.out.println("Integer: "+userInt);
		System.out.println("Float:"+userFloat);
		System.out.println("Double : "+userDouble);
		
		 

	}

}
