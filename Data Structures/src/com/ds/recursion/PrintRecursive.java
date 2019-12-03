package com.ds.recursion;

public class PrintRecursive {
	public static String print(int i){
		if (i == 0) {
			return " hello 0";
		}else{
			return " hello "+i +print(i-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(print(10));
	}
}
