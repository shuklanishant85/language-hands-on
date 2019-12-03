package com.ds.arrays.rotation;

public class ReversalAlgorithm {
	public static int[] rotate(int[] array,int d, int n){
		reverse(array,0,d-1);
		reverse(array,d,n-1);
		reverse(array,0,n-1);	
		return array;
	}
	
	public static void reverse(int[] array,int start, int end){
		while(start<end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;	
		}
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
