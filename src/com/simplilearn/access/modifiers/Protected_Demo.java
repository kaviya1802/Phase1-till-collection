package com.simplilearn.access.modifiers;

public class Protected_Demo {

	public static void main(String[] args) {
		// Public Access modifier: the data member can be access anywhere 
		Hero hero = new Hero();
		System.out.println("Hero Name:"+hero.name);
		System.out.println("Hero Power:"+hero.power);
		System.out.println("All data:");
		hero.showData();
	}
}
