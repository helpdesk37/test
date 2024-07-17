package com.questions;

/**
 * Find the duplicate element in a limited range array Given a limited range
 * array of size n containing elements between 1 and n-1 with one element
 * repeating, find the duplicate number in it without using any extra space.
 * 
 * For example,
 * 
 * Input: { 1, 2, 3, 4, 4 }Output: The duplicate element is 4 Input: { 1, 2, 3,
 * 4, 2 }Output: The duplicate element is 2
 * 
 * Not working for custom values
 */
public class ArrayQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 4, 4 };
		//int nums[] = { 5, 6, 7, 8, 8 };
		// System.out.println("duplicate elements are "+findDuplicate(nums));
		System.out.println("duplicate elements are " + findDuplicate1(nums));
		//System.out.println("duplicate elements are " + findDuplicate2(nums));

	}

	// Approach 1: Using Hashing
	private static int findDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		boolean boolean1[] = new boolean[nums.length + 1];
		for (int value : nums) {
			if (boolean1[value]) {
				return value;
			}
			boolean1[value] = true;
		}
		return -1;
	}

	// Approach 2: Using Array Indices
	private static int findDuplicate1(int[] nums) {
		int duplicate = -1;
		int n = nums.length;
		for (int val : nums) {
			int value = (val < 0) ? -val : val;
			if (nums[value] >= 0) {
				nums[value] = -nums[value];
			} else {
				duplicate = value;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				nums[i] = -nums[i];
			}
		}
		return duplicate;
	}

	//Approach 3: Using XOR
	private static int findDuplicate2(int[] nums) {
		int xor =0 ;
		for(int i:nums) {
			xor=xor^i;
			System.out.println(xor);
		}
		for(int i=1;i<=nums.length-1;i++) {
			xor=xor^i;
			System.out.println(xor);
		}
		return xor;
	}
}
