package com.ds.recursion;

public class FibonnacciSeries {
	static int returnNthFibonnacciNumber(int n){
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 1;
		}else {
			return returnNthFibonnacciNumber(n-1)+returnNthFibonnacciNumber(n-2);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print(returnNthFibonnacciNumber(i) + " ");
		}
	}
}
