package com.algo.search;

public class InterpolationSearch {

	public static int search(int[] array, int l, int h, int d) {
		int pos = 0;
		pos = l + ((d - array[l]) * (h - l) / (array[h] - array[l]));
		if (array[pos] == d) {
			return pos;
		} else if (array[pos] < d) {
			return search(array, pos + 1, h, d);
		} else if (array[pos] > d){
			return search(array, l, pos - 1, d);
		} else
		return -1;
	}

	public static int iterativeSearch(int[] array, int d) {
		int h = array.length - 1;
		int l = 0;
		int pos = 0;
		while (l <= h && d >= array[l] && d <= array[h]) {
			pos = l + ((d - array[l]) * (h - l) / (array[h] - array[l]));
			if (array[pos] == d) {
				return pos;
			} else if (array[pos] < d) {
				l = pos + 1;
			} else {
				h = pos - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
		int x = 18; // Element to be searched
		int index1 = iterativeSearch(arr, x);
		if (index1 != -1)
			System.out.println("Element found at index " + index1);
		else
			System.out.println("Element not found.");
		
		int index2 = search(arr,0,arr.length-1,x);
        
        // If element was found
        if (index2 != -1)
              System.out.println("Element (recursive) found at index " + index2);
           else
              System.out.println("Element (recursive) not found.");
	}

}
