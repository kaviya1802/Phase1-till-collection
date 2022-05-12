package com.simplilearn.collections;

public class TreeSet {

	public static void main(String[] args) {
		// TreeSet
		java.util.TreeSet<String> nameSet = new java.util.TreeSet<String>();
		
		nameSet.add("Kaviya");
		nameSet.add("Mohan");
		nameSet.add("Vijay");
		nameSet.add("Priya");
		nameSet.add("Selva");
		
		java.util.TreeSet<String> nameDesc = (java.util.TreeSet<String>) nameSet.descendingSet();
		
		for(String name : nameSet) {
			System.out.println("-> "+name);
		}
		
		for(String name : nameDesc) { //To print the data in decending order
			System.out.println("------> "+name);
		}
		
		
		

	}

}
