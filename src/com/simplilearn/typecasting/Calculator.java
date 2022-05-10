package com.simplilearn.typecasting;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Numeric calculator
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("******************************");
		System.out.println("***Welcome to Numeric Calculator***");
		System.out.println("******************************");
		
		System.out.println("Please enter the first variable:");
		int num1 = input.nextInt();
		
		System.out.println("\nPlease enter the second variable:");
		int num2 = input.nextInt();
		
		System.out.println("Addition:"+add(num1, num2));
		System.out.println("Subraction:"+sub(num1, num2));
		System.out.println("Multiplication:"+mul(num1, num2));
		System.out.println("Division:"+div(num1, num2));
	}
	
	public static double add(int a, int b) {
		return a+b;
	}
	public static double sub(int a, int b) {
		return a-b;
	}
	public static double mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return a/b;
	}
	
}
