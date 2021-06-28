package com.revature;

import java.util.Arrays;

public class BinarySearch {

	// n + 1 + log(n) + n log (n) -> O(n log n)
	public static void main(String[] args) {
		int[] ints = new int[] { 100, 34, 21, 78, 21, 99 }; // O(1)
		
		// Binary search requires a sorted array, so we can sort our array
		// "in place" with Arrays.sort(...)
		Arrays.sort(ints); // O(n log n)
		System.out.println(Arrays.toString(ints)); // O(n)
		
		System.out.println(binarySearch(34, ints)); // O(log n)
	}
	
	// Big-O time complexity: O(log(n))
	public static int binarySearch(int target, int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target < arr[mid]) {
				right = mid - 1;
			} else if (target > arr[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
}
