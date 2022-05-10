package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) throws IOException {
		// Throws Keyword: Used to declaring(Anouncing) an exception
		transaction(100); //method has to anounce that it will throw an exception
//		try {
//			transaction(100);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public static void transaction(int amount) throws IOException {
		if(amount>0) {
			System.out.println("Valid Amount :: " +amount);
		}else {
			throw new IOException("Invalid amount...");
		}
	}
}
