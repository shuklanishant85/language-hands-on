package com.algo.search;

public class ExpoentialSearch {
	public int search(int[] array, int d){
		//logic
		int exp = 1;
		while (array[exp] <= d) {
			exp*=2;
		}
		if (array[exp]==d) {
			return exp;
		}else {
			return BinarySearch.search(array, exp/2, Math.min(exp, array.length), d);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
		int x = 18; // Element to be searched
		ExpoentialSearch expoentialSearch = new ExpoentialSearch();
		
		int index = expoentialSearch.search(arr,x);
        
        // If element was found
        if (index != -1)
              System.out.println("Element (recursive) found at index " + index);
           else
              System.out.println("Element (recursive) not found.");
	}

}
