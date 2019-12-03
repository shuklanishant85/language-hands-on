package com.ds.backtracking;

public class KArySring {
	
	static int kAry[];
	static int count;
	
	static void printAllKAryString(int n,int k){
		if (kAry==null) {
			kAry = new int[n];
			count=0;
		}
		
		if (n<1) {
			System.out.print("[");
			for (int i = 0; i < kAry.length; i++) {
				System.out.print(kAry[i]);
			}
			System.out.println("]");
			count++;

		}else {
			for (int i = 0; i < k; i++) {
				kAry[n - 1] = i;
				printAllKAryString(n - 1, k);
			}
		}
	}
	
	public static void main(String[] args) {
		printAllKAryString(4, 4);
		System.out.println("number of string generated :: "+count);
	}
}
