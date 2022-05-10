package com.simplilearn.collections;

import java.util.Iterator;
import java.util.List;
public class LinkedList {

	public static void main(String[] args) {
		// ArrayList
		List<String> nameList = new java.util.LinkedList<String>();
		nameList.add("Kaviya");
		nameList.add("Selva");
		nameList.add("Nalla");
		nameList.add("Priya");
		nameList.add("Kaviya");
		
		System.out.println(nameList.get(2));
		System.out.println(nameList);
		
		Iterator<String> itr = nameList.iterator();
		
		//Old way of iteration
		while(itr.hasNext()) {
			System.out.println("Name :: "+itr.next());
		}
		System.out.println("************************");
		//Enhanced way of iteration: foreach
		for(String name : nameList ) {
			System.out.println("Name :: "+name);
		}

	}

}
