package com.revature.model;

public class Animal {

	public int age;
	public String species;
	public String size;
	public String color;
	
	// Constructor chaining
	public Animal(int age, String species, String size, String color) {
		this(age, species, size);
		this.color = color;
	}
	
	public Animal(int age, String species, String size) {
		this(age, species);
		this.size = size;
	}
	
	public Animal(int age, String species) {
		this(age);
		this.species = species;
	}
	
	public Animal(int age) {
		this();
		this.age = age;
	}
	
	public Animal() {
	}
	
	public void makeNoise() {
		System.out.println("generic animal noises");
	}
}
