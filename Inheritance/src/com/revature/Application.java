package com.revature;

import com.revature.model.Animal;
import com.revature.model.Mammal;

public class Application {

	public static void main(String[] args) {
		Mammal m = new Mammal(1, "Homo Longi", "Medium", "Dark", 4);
		m.toString(); // Mammal inherits from Animal which inherits from Object
		// Which means a Mammal object has access to the toString method inside of
		// the object class (which we can override)
		System.out.println(m.age);
		System.out.println(m.color);
		System.out.println(m.size);
		System.out.println(m.species);
		
		System.out.println(m.numOfLegs);
		m.makeNoise();
		
		Animal a = m;
		
		// At runtime, the JVM figures out what the a variable is pointing to
		// Is it pointing to an Animal object, or is it pointing to a Mammal object, 
		// Reptile object etc, and then figuring out which makeNoise() method to use 
		// (if there is an overridden method)
		a.makeNoise();
		
		a = new Animal();
		a.makeNoise();
	}

}
