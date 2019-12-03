package com.aocp.euclids;

public class GCD {

	public int getGCD(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		int r = m % n;
		if (r == 0) {
			return n;
		} else {
			m = n;
			n = r;
			return getGCD(m, n);
		}
	}
	
	public int getOptimizedGCD(int m, int n){
		if (m<n) {
			return getOptimizedGCD(n,m);
		}
		else if (m%n==0) {
			return n;
		}else {
			return getOptimizedGCD(n, m%n);
		}
	}
	
	public static void main(String[] args) {
		
		GCD gcd = new GCD();
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		System.out.println(gcd.getGCD(2166, 6099));
		endTime = System.nanoTime();
		System.out.println("Execution time for getGCD(m,n) : "+(endTime-startTime) +" nanoseconds");
		startTime=System.nanoTime();
		System.out.println(gcd.getOptimizedGCD(2166, 6099));
		endTime = System.nanoTime();
		System.out.println("Execution time for getOptimizedGCD(m,n) : "+(endTime-startTime) +" nanoseconds");

	}

}
