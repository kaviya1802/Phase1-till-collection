package com.simplilearn.collections;

import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		// Set type of collection allows only unique values
		//Hashset does not preserve insertion order
		Set<String> groceries = new java.util.HashSet<String	>();
		groceries.add("Oil");
		groceries.add("Bread");
		groceries.add("Fish");
		groceries.add("Eggs");
		groceries.add("Chocolate");
		groceries.add("Biscuit");
		
		System.out.println("The items are :: \n"+groceries);
		
		groceries.remove("Chocolate");
		
		for (String item : groceries) {
			System.out.println("-> "+item);
		}

	}

}
