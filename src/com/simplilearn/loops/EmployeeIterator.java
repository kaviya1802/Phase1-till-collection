package com.simplilearn.loops;

import java.util.Scanner;

public class EmployeeIterator {

	public static void main(String[] args) {
		// TODO Find Employee exists with in the list
		String[] employee = {"Selva", "Nalla", "Kaviya", "Vishnu", "Priya"};
		String company = "Simplilearn Tech";
		System.out.println("*****Welcome to employee verification Tool*****");
		System.out.println("Please enter the employee name: ");
		Scanner input = new Scanner(System.in);
		String empName = input.next();
		findEmployee(employee, empName);
	}
	public static void findEmployee(String[] employee, String empName) {
		boolean found = false;
		for (int i=0; i<employee.length; i++) {
			if(empName.equals(employee[i])) {  //.equalsignorecase to remove case sensitive)
				System.out.println("Employee found and the ID is :: " +i);
				found = true;
			}
		}
			if (!found) {
				System.out.println("Employee non available");
			}
			
		}
	}
