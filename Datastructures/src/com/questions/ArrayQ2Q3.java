package com.questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Check if a subarray with 0 sum exists or not
Given an integer array, check if it contains a subarray having zero-sum.

For example,

Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 } 
Output: Subarray with zero-sum exists The subarrays with a sum of 0 are: 
{ 3, 4, -7 }{ 4, -7, 3 }{ -7, 3, 1, 3 }{ 3, 1, -4 }{ 3, 1, 3, 1, -4, -2, -2 }{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 */
public class ArrayQ2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {4, -6, 3, -1, 4, 2, 7};
		boolean checkSubArray = checkSubArray(nums);
		if(checkSubArray) {
			System.out.println("sub array");
		}
	}

	private static boolean checkSubArray(int[] nums) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(0);
		int sum=0;
		for(int value:nums) {
			sum+=value;
			if(hashSet.contains(sum)) {
				System.out.println(hashSet);
				 return true;
			}
			hashSet.add(sum);
		}
		
		return false;
		
	}

}
