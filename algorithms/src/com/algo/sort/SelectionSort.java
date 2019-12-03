package com.algo.sort;

public class SelectionSort {

	public int[] sort(int[] array) {

		int temp;
		int min;
		int location;
		for (int i = 0; i < array.length; i++) {
			min = array[i];
			location=i;
			for (int j = i; j < array.length; j++) {
				if (array[j]<min) {
					min=array[j];
					location =j;
				}
			}
			temp=array[i];
			array[i] = array[location];
			array[location] =temp;
		}
		
		return array;
	}

	public static void main(String[] args) {
		int arr[] = { 21, 2, 13, 44, 34, 6, 7, 81, 9, 10, 12, 14, 123, 35, 146, 77 };
		System.out.print("sorted array: [");
		arr = new SelectionSort().sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print("]");
	}

}
