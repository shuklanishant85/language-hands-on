package com.aocp.euclids;

import java.util.Scanner;

public class MathematicalInduction {
	private static Scanner scan;

	public boolean prove(int n) {
		//getting first half of equation
		int pn = (int) Math.pow(n, 2);
		//getting second half of equation
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (2 * i - 1);
		}
		//checking if both half are true
		if (pn == sum) {
			return true;
		}
		return false;
	}

	public boolean proveByInduction(int n) {
		boolean proof = false;
		proof = prove(1);
		if (proof) {
			int k = 2;
			while (proof) {
				proof = prove(k + 1);
				if (k == n) {
					break;
				}
				k++;
			}
		}
		return proof;
	}
	
	public static void main(String[] args) {
		MathematicalInduction induction = new MathematicalInduction();
		scan = new Scanner(System.in);
		System.out.println("ENTER NUMBER TO VERIFY EQUATION: ");
		System.out.println(induction.proveByInduction(scan.nextInt()));
		scan.close();
	}

}
