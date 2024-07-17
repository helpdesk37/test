package com.questions;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 12, 11, 13, 5, 6, 7 };
		// int array[]= {5,7,2,3,1,9,15,20,22,3};
		sort(array, 0, array.length - 1);
		printArray(array);
	}

	private static void sort(int[] array, int startPoint, int endPoint) {
		// TODO Auto-generated method stub
		System.out.println("line 15");
		if (startPoint < endPoint) {
			int middle = startPoint + (endPoint - startPoint) / 2;
			System.out.println("line 18");
			sort(array, startPoint, middle);
			System.out.println("line 20");
			sort(array, middle + 1, endPoint);
			System.out.println("line 22");
			merge(array, startPoint, middle, endPoint);
			System.out.println("line 23");
		}
	}

	private static void merge(int[] array, int startPoint, int middle, int endPoint) {
		// TODO Auto-generated method stub
		System.out.println("line 28");
		int n1 = middle - startPoint + 1;
		int n2 = endPoint - middle;
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		for (int i = 0; i < n1; ++i) {
			leftArray[i] = array[startPoint + i];
			System.out.println("line 35 " + leftArray[i]);
		}
		for (int j = 0; j < n2; ++j) {
			rightArray[j] = array[middle + 1 + j];
			System.out.println("line 39" + rightArray[j]);
		}
		int i = 0, j = 0;
		int k = startPoint;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				System.out.println(array[k] + " " + leftArray[i]);
				i++;
			} else {
				array[k] = rightArray[j];
				System.out.println(array[k] + " " + rightArray[j]);
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = leftArray[i];
			System.out.println(array[k] + " " + leftArray[i]);
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			System.out.println(array[k] + " " + rightArray[j]);
			j++;
			k++;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
