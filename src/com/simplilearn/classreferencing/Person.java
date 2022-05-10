package com.simplilearn.classreferencing;

public class Person {
			int id;
			String name;
			int age;
			
			Person() {}; //Default Constructor
			
			public Person(String name) {
				this.name = name;
			}
			
			public Person(int id, String name) {
				this.id = id;
				this.name = name;
			}
			
			public Person(int id, String name, int age) {
				this.id = id;
				this.name=name;
				this.age=age;
			}
}
