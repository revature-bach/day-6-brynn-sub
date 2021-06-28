package com.revature;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
				
		// Built into Java is our various wrapper classes
		
		// Integer
		// Byte
		// Double
		// Float
		// Character
		// etc
		// So, whatever primitive we have, we have some sort of equivalent wrapper class 
		// for it
		
		Integer i = new Integer(10); // old way of creating a wrapper object for 
		// a primitive
		
		Integer i2 = 10; // We are taking the int primitive of value 10, and we are
		// "autoboxing" this primitive into its wrapper equivalent
		
		int a = i2; // Here we have an example of "unboxing"
		// Whereby the value property of the Integer object is being extracted "unboxed"
		// and then being assigned to the a variable.
		
		// An ArrayList is a type of List, which is a type of Collection
		// We cannot store primitives directly inside of Collections
		// We can only store objects
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(20);
		integers.add(-100);
		
		System.out.println(integers);
		
		// Comparison
		System.out.println("i == i2: " + (i == i2)); // false because the reference variable i
		// is pointing to a different object than reference variable i2
		// We know that i and i2 are reference variables because we declared them
		// as type "Integer", which corresponds to the wrapper class
		System.out.println("i.equals(i2): " + i.equals(i2));
		
		int b = 10;
		System.out.println(i == b); // i is an Integer object, b is an int primitive
		// It will unbox the Integer object into a primitive
		// using a comparison operator such as == between two primitives will compare
		// their values
		// and 10 == 10, so it is true
		
		/*
		 * Different wrapper class methods/properties
		 * 
		 * Our wrapper classes contain various static methods and static properties
		 * that are useful for us as programmers
		 * 
		 * For example, if we want to quickly find what the max and min value
		 * of an Integer is, there is 2 different static properties that contain said
		 * information
		 */
		System.out.println("Max value of an integer: " + Integer.MAX_VALUE);
		System.out.println("Min value of an integer: " + Integer.MIN_VALUE);
		
		// Parsing
		// Sometimes we want to convert a String, for example, into a primitive
		// or wrapper object equivalent
		String s = "10";
		int i3 = Integer.parseInt(s); // parseInt returns a primitive int
		Integer i4 = Integer.valueOf(s); // valueOf returns a wrapper object
	}
	
}
