package com.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Find a pair with the given sum in an array
 * Input: nums = [8, 7, 2, 5, 3, 1]target = 10 Output: Pair found (8, 2)orPair found (7, 3)  Input: nums = [5, 2, 6, 8, 1, 9]target = 12 Output: Pair not found
 */
public class ArrayQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,2,3,4,5};
		int target =3;
		findPair(array1, target);
		System.out.println("");
		findPair1(array1, target);
		System.out.println("");
		findPair2(array1, target);
	}

	//Using Brute-Force
	private static void findPair(int[] array1, int target) {
		for(int i=0;i<array1.length-1;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]+array1[j]==target) {
					System.out.printf("pair found ("+array1[i]+","+array1[j]+")");
					return;
				}
			}
		}
		System.out.println("no pair found");
	}
	
	//Using Sorting
	private static void findPair1(int[] array1, int target) {
		Arrays.sort(array1);
		int lowIndex =0;
		int highIndex = array1.length-1;
		while(lowIndex<highIndex) {
			//System.out.println(array1[lowIndex]+"===="+array1[highIndex]);
			if(array1[lowIndex]+array1[highIndex]==target) {
				System.out.println("pair1 found ("+array1[lowIndex]+","+array1[highIndex]+")");
				return;
			}
			if(array1[lowIndex]+array1[highIndex]<target) {
				lowIndex++;
			}else {
				highIndex--;
			}
		}
	}
	
	private static void findPair2(int[] array1, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0;i<array1.length;i++) {
			if(hashMap.containsKey(target-array1[i])){
				System.out.printf(""+array1[hashMap.get(target-array1[i])],array1[i]);
				return;
			}
			hashMap.put(array1[i], i);
		}
	}

}
