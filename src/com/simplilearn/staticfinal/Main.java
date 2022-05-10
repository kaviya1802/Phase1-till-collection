package com.simplilearn.staticfinal;

public class Main {

	public static void main(String[] args) {
		// Static variable/ static method are directly accessed within class name.
		
		StaticMethod.getMark();
		
		//non-static variables /menthod need objects /instance to operate
		
		StaticMethod st = new StaticMethod();
		
		st.gedAvg();
		st.getMark();

	}

}
