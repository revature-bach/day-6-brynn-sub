package com.revature;

public class StackOverflowExample {

	public static void main(String[] args) {
		printNumberLower(10);
	}
	
	public static void printNumberLower(int num) {
		if (num == 0) return;
		
		System.out.println(num - 1);
		printNumberLower(num - 1);
	}

}
