package com.simplilearn.exceptionhandling;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) throws AccountNotFoundException, TransactionException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Account Number:: ");
		int accNo = input.nextInt();
		System.out.println("Please enter the Account Name::");
		String accName = input.next();
		System.out.println("Please enter the balance amount::");
		float accBalance = input.nextFloat();
		showBalance(accNo, accName, accBalance);
		
		System.out.println("!!!!!!!Welcome to deposit the amount!!!!!!!!");
		System.out.println("Enter the amount you want to deposit::");
		float depAmount = input.nextFloat();
		depositAmount (accBalance, depAmount);
		System.out.println("Enter the amount you want to withdraw::");
		float withdrawAmount = input.nextFloat();
		withdrawAmount (accBalance, withdrawAmount);
	}
	
	public static void depositAmount (float accBalance, float depAmount) throws TransactionException{
		if(depAmount>0) {
			depAmount = accBalance+depAmount;
			System.out.println("The current account balance :: "+depAmount);
		}else {
			throw new TransactionException();
		}
		
				
	}
	public static void showBalance(int accNo, String accName, float accBalance) throws AccountNotFoundException {
		if(accNo == 1196443) {
			System.out.println("The account "+accNo+ " , "+accName+" having Balance of : "+accBalance);
		}else {
			throw new AccountNotFoundException(+accNo+" is not available");
		}
	}
		
		public static void withdrawAmount(float accBalance, float withdrawAnount) throws TransactionException{
		if(withdrawAnount>0) {
			accBalance = accBalance-withdrawAnount;
			System.out.println("The balance after withdrawal of "+withdrawAnount+ " is :: "+accBalance);
		}else {
			throw new TransactionException();
		}
	}

}
