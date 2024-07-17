package com.questions;

import java.util.Arrays;

public class ArrayQ4 {

	/**
	 * Sort binary array in linear time Given a binary array, sort it in linear time
	 * and constant space. The output should print all zeros, followed by all ones.
	 * 
	 * For example,
	 * 
	 * Input: { 1, 0, 1, 0, 1, 0, 0, 1 } Output: { 0, 0, 0, 0, 1, 1, 1, 1 }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 0, 1, 0, 1, 0, 0, 1 };
		/*
		 * sort(array); System.out.println(Arrays.toString(array)); sort1(array);
		 * System.out.println(Arrays.toString(array));
		 */
		sort2(array);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		int zeros = 0;
		for (int value : array) {
			if (value == 0) {
				zeros++;
			}
		}
		int k = 0;
		while (zeros-- != 0) {
			array[k++] = 0;
		}
		while (k < array.length) {
			array[k++] = 1;
		}
	}
	private static void sort1(int[] array) {
		int k=0;
		for(int value:array) {
			if(value==0) {
				array[k++]=0;
			}
		}
		for(int i=k;i<array.length;i++) {
			array[k++]=1;
		}
	}
	
	private static void sort2(int[] array) {
		int pivot =1;
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<pivot) {
				swap(array,i,j);
				j++;
			}
		}
		
		
	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
