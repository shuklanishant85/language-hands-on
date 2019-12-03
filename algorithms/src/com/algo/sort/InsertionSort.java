package com.algo.sort;

public class InsertionSort {

	public int[] sort(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i-1;
				while (j>=0 && array[j]>key) {
					array[j+1]=array[j];
					j = j-1;
				}
				array[j+1]=key;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int arr[] = { 21, 2, 13, 44, 34, 6, 7, 81, 9, 10, 12, 14, 123, 35, 146, 77 };
		System.out.print("sorted array: [");
		arr = new InsertionSort().sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print("]");
	}
}
