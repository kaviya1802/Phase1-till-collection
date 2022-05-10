package com.simplilearn.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// Exception Handling
		transaction(10, "Kaviya");

	}
	public static void transaction(int amount, String name) {
		int balance = 20000;
		int res = 0;
		try {
			res = balance / amount; //Arithmetic Exception when amount is 0
			name.length(); //Null pointer Exception occurs when username is Null
			int resp = Integer.parseInt(name); //Number Format Exception when the string is non-convertible value
			
		} catch (ArithmeticException e) {
			System.out.println("Handled ..."+e.getClass());
		}catch (NumberFormatException e) {
			System.out.println("Handled ..."+e.getClass());
		}catch (NullPointerException e) {
			System.out.println("Handled ..."+e.getClass());
		}catch(Exception e) {
			System.out.println("Exception occurs..."+e.getClass());
		}
		System.out.println("The Avg is :: "+res);
	}
		
}
