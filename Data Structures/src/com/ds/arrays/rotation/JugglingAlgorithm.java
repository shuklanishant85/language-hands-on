package com.ds.arrays.rotation;

public class JugglingAlgorithm {

	public static int[] rotate(int[] array, int d, int n){
		int gcd = gcd(n,d);
		int j;		
		for (int i = 0; i < gcd; i++) {
			j=i;
			int temp = array[i];
			while(j+d<n){
				array[j]=array[j+d];
				j=j+d;
			}
			array[j]=temp;	
		}	
		return array;
	}
	
	public static int gcd(int n, int d){
		int r=n%d;
		if (r==0) return d;
		else return gcd(d,r);
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] arr2 = rotate(arr, 3, 12);
		System.out.print("[");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

	
}
