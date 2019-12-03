package com.ds.arrays.rotation;

public class TempArrayRotationAlgorithm {
	
	public static int[] rotate(int array[], int d, int n){
		
		int[] temp = new int[d];
		System.arraycopy(array, 0, temp, 0, d);
		
		for (int i = 0; i < array.length-d; i++) {
			array[i] = array[i+d];
		}
		System.arraycopy(temp, 0, array, n-d, temp.length);
		return array;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int[] arr2 = rotate(arr, 2, 7);
		System.out.print("[");
		for (int i : arr2) {
			System.out.print(i);
		}
		System.out.println("]");
	}

}
