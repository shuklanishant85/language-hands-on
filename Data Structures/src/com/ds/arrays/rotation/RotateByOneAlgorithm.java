package com.ds.arrays.rotation;

public class RotateByOneAlgorithm {
	
	public static int[] rotate(int array[],int d, int n){
		//start
		int temp;
		//loop
		for (int i = 0; i < d; i++) {
			temp = array[0];
			for (int j = 0; j < n-1; j++) {
				array[j] = array[j+1];
			}
			array[n-1] =temp;
		}
		//end
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
