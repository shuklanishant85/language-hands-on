package com.lambda.learning;

@FunctionalInterface
public interface LambdaInterfaceTwo {

	public String printaAgain(String s1, String s2);

	public default void printDefault() {
		System.out.println("this is default");
	}

	public default String printGiven(String data) {
		System.out.println("JAVA 8: interfaces can one or more default methods");
		return "data : " + data;
	}
	
	public static void PrintStatic() {
		System.out.println("JAVA 8: interfaces can have static methods also (but with body)");
	}

}
