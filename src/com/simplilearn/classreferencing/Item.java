package com.simplilearn.classreferencing;

public class Item {
	int id;
	String name;
	String desc;
	float price;
	float quantity;
	
	public Item(int id) {
		super();
		this.id = id;
	}
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Item(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public Item(int id, String name, String desc, float price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	public Item(int id, String name, String desc, float price, float quantity) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}
	
}
