package com.simplilearn.access.modifiers;

public class Hero {
	public String name = "Selva Prakash";
	protected String power = "Healing Power";
	
	protected void showData() {
		System.out.println("Name:"+name);
		System.out.println("Power:"+power);
	}
}


