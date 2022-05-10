package com.simplilearn.classreferencing;

public class Main {

	public static void main(String[] args) {
			Person p1 = new Person();
			p1.id = 1196443;
			p1.name = "Kaviya";
			p1.age = 26;
			Person p2 = new Person("SelvaPrakash");
			Person p3 = new Person(1196442, "Nalla");
			Person p4 = new Person(1196440, "Priya", 30);
			System.out.println("Employee Details:\n");
			System.out.println("The Employee's id -> "+p1.id+", Name -> "+p1.name+" and Age -> "+p1.age);
			System.out.println("The Employee's id -> "+p2.id+", Name -> "+p2.name+" and Age -> "+p2.age);
			System.out.println("The Employee's id -> "+p3.id+", Name -> "+p3.name+" and Age -> "+p3.age);
			System.out.println("The Employee's id -> "+p4.id+", Name -> "+p4.name+" and Age -> "+p4.age);
			
			Item i1 = new Item(1);
			Item i2 = new Item(2, "Paste");
			Item i3 = new Item(3, "Soap", "Helps cleaning");
			Item i4 = new Item(4, "Jeera", "Helps to add taste", 25.50f);
			Item i5 = new Item(5, "Dal", "USed to make cravy", 30.00f, 2);
			
			System.out.println("\nITEM DETAILS:\n");
			System.out.println("The Item ID -> "+i1.id+", Name -> "+i1.name+", Desc-> "+i1.desc+", price -> "+i1.price+" and Quantity -> "+i1.quantity);
			System.out.println("The Item ID -> "+i2.id+", Name -> "+i2.name+", Desc-> "+i2.desc+", price -> "+i2.price+" and Quantity -> "+i2.quantity);
			System.out.println("The Item ID -> "+i3.id+", Name -> "+i3.name+", Desc-> "+i3.desc+", price -> "+i3.price+" and Quantity -> "+i3.quantity);
			System.out.println("The Item ID -> "+i4.id+", Name -> "+i4.name+", Desc-> "+i4.desc+", price -> "+i4.price+" and Quantity -> "+i4.quantity);
			System.out.println("The Item ID -> "+i5.id+", Name -> "+i5.name+", Desc-> "+i5.desc+", price -> "+i5.price+" and Quantity -> "+i5.quantity);
	}

}
