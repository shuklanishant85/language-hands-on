package com.ds.arrays.rotation;

public class ClockwiseRotationAlgorithm {
	public int[] rotate(int[] array, int n){
		
		int temp = array[n-1];
		int i = n-1;
		while(i>0){
			array[i] = array[i-1];
			i--;
		}
		array[0]=temp;
		return array;
	}
	
	public static void main(String[] args) {
		ClockwiseRotationAlgorithm algo = new ClockwiseRotationAlgorithm();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] arr2 = algo.rotate(arr,12);
		System.out.print("[");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
}
