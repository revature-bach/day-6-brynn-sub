package com.revature;

public class Application {

	public static void main(String[] args) {
		
		// String literal: a sequence of characters that is surrounded by double quotes
		char[] helloWorld = new char[] { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String s = new String(helloWorld);
		
		System.out.println(s == "Hello World");
		System.out.println(s.equals("Hello World"));
		
		System.out.println("Hello World" == "Hello World");
	}

}
