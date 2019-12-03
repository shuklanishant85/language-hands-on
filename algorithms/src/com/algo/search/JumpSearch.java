package com.algo.search;

public class JumpSearch {
	public static int search(int[] array, int d) {
		// Finding block size to be jumped
		int length = array.length;
		int block = (int) Math.floor(Math.sqrt(length));
		int blockCount = 0;
		int prevBlock = 0;

		// Finding the block where element is
		// present (if it is present)

		while (array[Math.min(blockCount, length-1)] < d) {
			prevBlock=blockCount;
			blockCount+=block;
		}
		// Doing a linear search for d in block
		while (array[Math.min(blockCount, length-1)] >= d) {
			if (blockCount>0) {
				blockCount--;
			}
			if (array[blockCount] == d) {
				return blockCount;
			}else if (blockCount == prevBlock) {
				return -1;
			}
		}
		
		// If we reached next block or end of
		// array, element is not present
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 1;

		// Find the index of 'x' using Jump Search
		int index = search(arr, x);

		// Print the index where 'x' is located
		System.out.println("\nNumber " + x + " is at index " + index);
	}
}