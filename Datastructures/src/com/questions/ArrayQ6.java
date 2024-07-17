package com.questions;

public class ArrayQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 0, 2, 1, 4, 3, 1, 0 };
		findMaxSubarray(A);
	}

	private static void findMaxSubarray(int[] a) {
		// TODO Auto-generated method stub
		int len = 1;
		int start = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			int minVal = a[i], maxVal = a[i];
			for (int j = i + 1; j < a.length; j++) {
				minVal = Math.min(minVal, a[j]);
				maxVal = Math.max(maxVal, a[j]);
				if (isConsecutive(a, i, j, minVal, maxVal)) {
					if (len < maxVal - minVal + 1) {
						len = maxVal - minVal + 1;
						start = i;
						end = j;
					}
				}
			}
		}
		System.out.println("" + start + "" + end);
	}

	private static boolean isConsecutive(int[] a, int i, int j, int minVal, int maxVal) {
		// TODO Auto-generated method stub
		if (maxVal - minVal != j - 1) {
			return false;
		}
		boolean visited[] = new boolean[j - i + 1];
		for (int k = i; k <= j; k++) {
			if (visited[a[k] - minVal]) {
				return false;
			}
			visited[a[k] - minVal] = true;
		}
		return false;
	}

}
