package com.simplilearn.access.modifiers;

public class Private_Demo {

	public static void main(String[] args) {
		// Public Access modifier: the data member can be access anywhere 

		Father father = new Father();  //As the class has public variables its accessible anywhere
		father.showAll();
		
		
		System.out.println("Park #:"+father.park);
		System.out.println("Donation #:"+father.donation);
		
		System.out.println("Park @:"+father.showPark());
		System.out.println("Donation @:"+father.showDonation());
		
		Mother mother = new Mother();
		mother.showAll();
		
	}
}
class Mother{  //Encapsulation : declaring private data member and accessing it via public method

	private double bankMoney = 5174198.98; //private data member
	
	private double showMoney() {
		return bankMoney;
	}
	
	public void showAll() { //public method
		System.out.println("Money : "+bankMoney);
		System.out.println("call Money:"+showMoney());
	}
	
}
