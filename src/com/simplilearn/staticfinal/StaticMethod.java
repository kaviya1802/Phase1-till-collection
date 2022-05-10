package com.simplilearn.staticfinal;

public class StaticMethod{
		// Static variable
		public static int marks = 100;
		
		//non-static variable
		
		public float avgMarks = 25.00f;
		
		//Static method
		public static void getMark() {
			System.out.println("The mark value is :: "+marks);
		}
		
		//non-static menthod
		public void gedAvg() {
			System.out.println("The AvgMark is :: "+avgMarks);
			System.out.println("The mark is :: "+marks); //static variable can be accessed within non-static method
		}
}
