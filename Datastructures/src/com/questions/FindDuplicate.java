package com.questions;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1, 3, 4, 8, 2}; // Example input array
	        System.out.println("Duplicate element: " + findDuplicate(nums));
	}
	public static int findDuplicate(int[] nums) {
        // Using Floyd's Tortoise and Hare (Cycle Detection)
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Phase 1: Finding the intersection point
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        // Phase 2: Finding the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }
}
