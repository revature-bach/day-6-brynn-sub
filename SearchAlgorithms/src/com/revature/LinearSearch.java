package com.revature;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] ints = new int[] { 100, 34, 21, 78, 21, 99 };

		System.out.println(linearSearch(78, ints));
	}
	
	// Big-O time complexity: O(n)
	public static int linearSearch(int target, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
