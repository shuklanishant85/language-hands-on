package com.algo.sort;

public class MergeSort {

	public int[] sort(int[] array, int l, int r) {
		if (l < r) {
			int middle = (l + r) / 2;
			sort(array, l, middle);
			sort(array, middle + 1, r);
			merge(array, l, middle, r);
		}
		return array;
	}

	public void merge(int[] array, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArr[i] = array[l + i];
		}
		for (int i = 0; i < n2; i++) {
			rightArr[i] = array[m + 1 + i];
		}

		// merge sub-arrays
		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (leftArr[i] < rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			} else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 21, 2, 13, 44, 34, 6, 7, 81, 9, 10, 12, 14, 123, 35, 146, 77 };
		System.out.print("sorted array: [");
		arr = new MergeSort().sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print("]");
	}

}
