package com.simplilearn.access.modifiers;

public class Default_Demo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		System.out.println("Movie Name:"+movie.movie_name);
		System.out.println("Actor Name:"+movie.actor_name);
		movie.showAll();
	}
}

