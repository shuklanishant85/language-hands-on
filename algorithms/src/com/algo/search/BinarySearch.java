package com.algo.search;

public class BinarySearch {

	public static int search(int[] array, int l, int r, int d) {

		if (r > l) {

			int mid = l + (r - l) / 2;
			if (array[mid] == d) {
				return mid;
			} else if (array[mid] > d) {
				return search(array, l, mid - 1, d);
			} else {
				return search(array, mid + 1, r, d);
			}
		}
		return -1;
	}

	public static int iterativeSearch(int[] array, int l, int r, int d) {

		while (l < r) {
			int mid = l + (r - l) / 2;
			if (array[mid] == d) {
				return mid;
			} else if (array[mid] > d) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 23, 35, 46, 77 };
		System.out.println("[" + search(arr, 0, 17, 14) + "]");
		System.out.println("[" + iterativeSearch(arr, 0, 17, 14) + "]");

	}

}
