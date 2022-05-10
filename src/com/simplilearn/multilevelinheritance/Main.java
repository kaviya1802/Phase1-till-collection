package com.simplilearn.multilevelinheritance;

public class Main {

	public static void main(String[] args) {
		// Multilevel inheritance
		
		Bike bike = new Bike();
		bike.service();
		System.out.println("The no of wheels are ::"+bike.getWheels());
		System.out.println("The Speed is ::"+bike.run());

	}

}
