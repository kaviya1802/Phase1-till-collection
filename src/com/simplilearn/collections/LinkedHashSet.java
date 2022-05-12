package com.simplilearn.collections;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		// Linked HashSet
		Set<String> empList = new java.util.LinkedHashSet<String>();
		empList.add("Kaviya Neminathan");
		empList.add("Selvaprakash Sellamuthu");
		empList.add("Vishnu Gopal");
		empList.add("Nallasivam Neminthan");
		empList.add("Kalaiselvi Neminathan");
		empList.add("Kaviya Neminathan");
		
		System.out.println("The employee list is : \n"+empList);
		for(String emp : empList) {
			System.out.println("-> "+emp);
		}
		
		Iterator<String> itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println("--> "+itr.next());
		}
		
	}

}
