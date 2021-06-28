package com.revature;

import com.revature.model.Animal;

public class Application {

	public static void main(String[] args) {
		method1();
		
		// ctrl + space will bring up intellisense
		Animal a;
		a = new Animal(4, "Yellow", "Sparky");
		
		System.out.println(a.feet);
		
		Animal a2;
		a2 = new Animal(a);
		a2.feet += 2;
		
		System.out.println(a.feet);
		System.out.println(a2.feet);
		
		method2();
		
		// ...
	}
	
	public static void method1() {
		String s;
		s = "Hello";
	}
	
	public static void method2() {
		Animal a = new Animal(2, "test", "test");
	}

}
