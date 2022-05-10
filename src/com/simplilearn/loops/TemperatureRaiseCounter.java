package com.simplilearn.loops;

public class TemperatureRaiseCounter {

	public static void main(String[] args) {
		// Temperture Raise Counter: WAP to increase temperature by 20 till it reaches 100
		float temperature = 0.0f;
		while(temperature<100) {
			System.out.println("The Temperature is :: " +temperature);
			temperature= temperature+20;
		}
		
		while(temperature>=0.0) {
			System.out.println("The temperature is :: "+temperature);
			temperature = temperature - 20;
		}
		System.out.println("*****FOR LOOP*****");
		float temp=0.0f;
		for(; temp<100;) {
			System.out.println("The Temperature is :: "+temp);
			temp = temp+20;
		}
		for(;temp>=0.0;) {
			System.out.println("The Temperature is :: "+temp);
			temp = temp-20;
		}
	}

}
