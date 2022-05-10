package com.simplilearn.exceptionhandling;

public class TransactionException extends Exception{
		String message;
		public TransactionException() {
			this.message=message;
		}
		
		public String getMessage() {
			return message;
		}
		
		public String toString() {
			return "Deposit/Withdrawal amount cannot be Zero!!!!";
		}
}
