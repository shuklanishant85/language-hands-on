package com.ds.backtracking;

public class BinaryString {
	static int binary[];
	static int binaryCount;
	
	static void printAllBinary(int digit){
		if (binary==null) {
			binary = new int[digit];
			binaryCount=0;
		}
		if (digit<1) {
			System.out.print("[");
			for (int num : binary) {
				System.out.print(num);
			}
			System.out.println("]");
			binaryCount++;
		}else {
			binary[digit-1] = 0;
			printAllBinary(digit-1);
			binary[digit-1] = 1;
			printAllBinary(digit-1);
		}
	}
	
	public static void main(String[] args) {
		printAllBinary(2);
		System.out.println("number of binary strings : "+binaryCount);
	}
}
