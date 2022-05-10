package com.simplilearn.access.modifiers;

public class Movie {
	String movie_name = "MMS";
	String actor_name = "Kaviya";
	
	protected void showAll() {
		System.out.println("Movie:"+movie_name);
		System.out.println("Actor:"+actor_name);
	}
}
