package com.simplilearn.access.modifiers;

public class Public_Demo {

	public static void main(String[] args) {
		// Public Access modifier: the data member can be access anywhere 

		Father father = new Father();
		father.showAll();
		
		System.out.println("Park #:"+father.park);
		System.out.println("Donation #:"+father.donation);
		
		System.out.println("Park @:"+father.showPark());
		System.out.println("Donation @:"+father.showDonation());
		
	}
}
class Father{
	public String park = "Kaviya's National Park";
	public double donation = 120002.53;
	
	public String showPark() {
		return park;
	}
	
	public double showDonation() {
		return donation;
	}
	
	public void showAll() {
		System.out.println("Park:"+park);
		System.out.println("Donation:" +donation);		
	}
}
