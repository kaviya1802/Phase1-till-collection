package com.simplilearn.loops;

public class ForLoop {

	public static void main(String[] args) {
		// For Loop: Used for Simple iteration
//		ex: Counter example
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<10;i++) {
			System.out.println("The Count value is :: "+i);
		}
		System.out.println("*********************");
		for(int i=10;i>0;i--) {
			System.out.println("The Count value is :: "+i);
		}
		System.out.println("*********************");
		for(int j:arr) {
			System.out.println("The Array value is :: "+j);
		}

	}

}
