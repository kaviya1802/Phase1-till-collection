package com.simplilearn.inheritance;

import com.simplilearn.multilevelinheritance.TwoWheeler;

public class Main {

	public static void main(String[] args) {
		// Single inheritance
		Bike bike = new Bike();
//		bike.speed = 100;
		bike.service();
		System.out.println("The Speed is :: "+bike.run());
		
		//Multilevel inheritance
		TwoWheeler tw = new TwoWheeler();
		System.out.println("No of wheels :: "+tw.noOfWheels);
	}

}
