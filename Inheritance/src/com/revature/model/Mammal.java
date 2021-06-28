package com.revature.model;

public class Mammal extends Animal {

	public int numOfLegs;
	
	public Mammal(int age, String species, String size, String color, int numOfLegs) {
		super(age, species, size, color);
		this.numOfLegs = numOfLegs;
	}
	
	// Quick example of overriding
	public void makeNoise() {
		System.out.println("Mammal making mammal noises");
	}
}
