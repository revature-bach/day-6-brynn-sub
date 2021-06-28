package com.revature;

public class RecursiveAlgorithm {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21
		System.out.println(calculateNthFib(5));
	}
	
	public static long calculateNthFib(int n) {
		
		// 1 * (number of times calculateNthFib)
		// 1 * 2^n = O(2^n)
		if (n == 1 || n == 2) {
			return 1;
		}
		
		return calculateNthFib(n - 2) + calculateNthFib(n - 1);
	}

}
