package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		//Linked List
		
		Employee emp1 = new Employee(1196443, "Kaviya", 100000, "HR");
		Employee emp2 = new Employee(1196442, "Selva", 200000, "IT");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		
		for(Employee emp : employees) {
			System.out.println("The Employee :: "+emp.empId + " is "+emp.empName);
		}

	}

}
