package com.lambda.learning;

import java.util.Comparator;

public class LambdaExpressions {
	
	static String greet = "Hi ! ";

	public static void main(String[] args) {

		exampleOne();
		exampleTwo();
		exampleThree();
		exampleFour();
		exampleFive();

	}

	static void exampleOne() {
		Comparator<String> stringComparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}

		};

		int comparison = stringComparator.compare("hello", "world");
		System.out.println(comparison);

		Comparator<String> stringComparatorLambda = (s1, s2) -> s1.compareTo(s2);

		int lambdaComparison = stringComparatorLambda.compare("hello", "world");
		System.out.println(lambdaComparison);
	}

	static void exampleTwo() {
		LambdaInterface lambda = text -> System.out.println(text);
		lambda.print("hello world");
	}

	static void exampleThree() {
		LambdaInterfaceTwo lambdaTwo = (one, two) -> {
			System.out.println(one + " " + two);
			return one + " " + two;
		};
		String returnVal = lambdaTwo.printaAgain("Hello", "World");
		System.out.println(returnVal);
	}

	static void exampleFour() {
		LambdaInterfaceTwo lambdaTwo = (one, two) -> one + " " + two;
		String returnVal = lambdaTwo.printaAgain("Hello", "World");
		System.out.println(returnVal);
		lambdaTwo.printDefault();
		System.out.println(lambdaTwo.printGiven("nishant"));
		LambdaInterfaceTwo.PrintStatic();
	}

	static void exampleFive() {
		final String localString = "Hey, there.";
		LambdaInterfaceTwo lambda = (s1, s2) -> greet + localString + " " + s1 + " " + s2;
		greet = "Hi !! ";
		System.out.println(lambda.printaAgain("Hello ", "World"));
	}
}