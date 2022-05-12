package com.simplilearn.collections;

import java.util.LinkedHashSet;

public class EmployeeSet {

	public static void main(String[] args) {


		Employee emp1 = new Employee(1196443, "Kaviya", 100000, "HR");
		Employee emp2 = new Employee(1196442, "Selva", 200000, "IT");
		Employee emp3 = new Employee(1196441, "Priya", 30000, "Testing");
		Employee emp4 = new Employee(1196440, "Nemi", 40000, "Former");
		
		LinkedHashSet<Employee> employee = new LinkedHashSet<Employee>();
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(new Employee(1196439, "Harshitha",40000, "Kidz"));
		
		for(Employee emp : employee) {
			System.out.println("Employee - >"+ emp.empId+" | Name -> "+emp.empName+ " | Salary -> "+emp.salary+" | Dept -> "+ emp.dept);
		}

	}

}
