package com.java.basics;

/**
 * @author nisshukl0
 *
 */
public class XorProblem {

	/**
	 * @param m
	 * @param n
	 * @return
	 */
	public static int findXOR(int m, int n) {
		if (m > n) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		int mXOR = findXORForRange(m - 1);
		int nXOR = findXORForRange(n);
		return mXOR ^ nXOR;
	}

	private static int findXORForRange(int m) {
		if (m % 4 == 0) {
			return m;
		} else if (m % 4 == 1) {
			return 1;
		} else if (m % 4 == 2) {
			return m + 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(findXOR(3, 4));
	}
}
