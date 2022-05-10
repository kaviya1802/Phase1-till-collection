package com.simplilearn.exceptionhandling;


public class AccountNotFoundException extends Exception{
	String message;
	
	AccountNotFoundException(String message){
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
	public String toString() {
		return "::::Account does not exist....::::!" +message;
	}
	
	
}
