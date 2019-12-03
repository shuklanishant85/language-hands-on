package com.ds.arrays.rotation;

public class BlockSwapAlgorithm {

	public int[] swap(int[] array, int fi, int si, int d) {
		for (int i = 0; i < d; i++) {
			int temp = array[fi + i];
			array[fi + i] = array[si + i];
			array[si + i] = temp;
		}
		return array;
	}

	public int[] rotate(int[] array, int d, int n) {

		if (d == 0 || d == n) {
			return array;
		} else if (n - d == d) {
			swap(array, 0, n - d, d);
			return array;
		} else if (d < n - d) {
			swap(array, 0, n - d, d);
			rotate(array, d, n - d);
			return array;
		} else {
			swap(array, 0, d, n - d);
			rotate(array, 2 * d - n, d);
			return array;
		}
	}
	
	public static void main(String[] args) {
		BlockSwapAlgorithm algo = new BlockSwapAlgorithm();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] arr2 = algo.rotate(arr, 3, 12);
		System.out.print("[");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
}