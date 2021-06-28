package com.revature.model;

public class Animal {

	public static int numOfInstances;
	
	public int feet;
	public String color;
	public String name;
	
	public Animal(int numOfFeet, String color, String name) {
		feet = numOfFeet; // you don't necessarily need to use this.<variable name>
		// if there is no variable shadowing going on
		this.color = color;
		this.name = name;
		
		numOfInstances++;
	}
	
	// Copy constructors
	public Animal(Animal animal) {
		this.feet = animal.feet;
		this.color = animal.color;
		this.name = animal.name;
	}
}
