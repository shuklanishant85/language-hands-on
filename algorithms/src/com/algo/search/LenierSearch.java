package com.algo.search;

public class LenierSearch {

	public static int search(int[] array, int n, int d) {
		int i = 0;
		for (i = 0; i < n; i++) {
			if (d == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.print("["+search(arr,7,3)+"]");
		
	}

}
