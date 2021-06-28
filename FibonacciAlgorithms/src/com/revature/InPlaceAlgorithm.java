package com.revature;

public class InPlaceAlgorithm {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21
		System.out.println(calculateNthFib(50));
	}
	
	public static long calculateNthFib(int n) {
		// 3 + 1*(n - 1) + 1
		// = 3 + n - 1 + 1
		// 3 + n -> O(n)
		
		// Big O space complexity O(n)
		long[] arr = new long[n];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		return arr[arr.length - 1];
	}
}
