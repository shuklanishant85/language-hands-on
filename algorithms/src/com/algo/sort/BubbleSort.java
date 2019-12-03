package com.algo.sort;

public class BubbleSort {
	public int[] sort(int[] array) {
		boolean complete = false;
		int temp;
		while (!complete) {
			complete = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					complete = false;
				}
			}

		}
		return array;
	}

	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		int arr[] = { 21, 2, 13, 44, 34, 6, 7, 81, 9, 10, 12, 14, 123, 35, 146, 77 };
		System.out.print("sorted array: [");
		arr = new BubbleSort().sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print("]");
	}
}
