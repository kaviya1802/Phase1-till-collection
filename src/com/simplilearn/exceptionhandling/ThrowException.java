package com.simplilearn.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		// Throw Keyword- to Throw the exception
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Age :: ");
		int age = input.nextInt();
		ageValidator(age);
		
		System.out.println("\nPlease enter the amount:: ");
		int amount = input.nextInt();
		transaction(amount);
	}
	public static void ageValidator(int age) {
		try {
			if(age>=18) {
				System.out.println("****Welcome to facebook*****");
			}else {
				throw new Exception("Not a valid age to have Facebook!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error message: "+e.getMessage());
		}
		System.out.println("Age value is :: "+age);
	}
	public static void transaction(int amount) {
		try {
			int balance = 20000;
			int avg = 0;
			if(amount >0) {
				avg = balance/amount;
				System.out.println("The Avg is :: "+avg);
			}else {
				throw new IOException("Invalid amount");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured...");
			System.out.println("The Error message is : :"+e.getMessage());
			System.out.println("THe Error class is ::"+e.getClass());
		}
	}

}
