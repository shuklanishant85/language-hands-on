package com.streams.learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// martin fowler: Collection Pipeline Pattern
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// find the sum of double of all even numbers
		//imperativeStyle(listOfNumbers);
		//functionalStyle(listOfNumbers);
		parallelStyle(listOfNumbers);
		System.out.println("--------------");
		use(listOfNumbers.stream());
		System.out.println("--------------");
		forkJoinPoolParallel(listOfNumbers.stream());
		

	}

	static void functionalStyle(List<Integer> listOfNumbers) {
		// functional style has less complexity and is easier to parallelize
		System.out.println(listOfNumbers
							.stream()
							.filter(x -> x % 2 == 0)
							.mapToInt(x -> x * 2)
							.sum());

	}

	static void imperativeStyle(List<Integer> listOfNumbers) {

		int sum = 0;
		for (Integer integer : listOfNumbers) {
			if (integer % 2 == 0) {
				sum += integer * 2;
			}
		}
		System.out.println(sum);
	}
	
	static void parallelStyle(List<Integer> listOfNumbers) {
		listOfNumbers.stream().parallel()
			.map(e -> transform(e))
			.forEach(System.out::println);
	}

	private static int transform(int e) {
		sleep(1000);
		return e*1;
	}

	private static boolean sleep(long delay) {
		try {
			Thread.sleep(delay);
			return true;
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
	}
	
	static void use(Stream<Integer> stream) {
		stream
		.parallel()
		.map(e -> transform(e))
		.forEach(System.out::println);
	}
	
	static void forkJoinPoolParallel(Stream<Integer> stream) {
		
		//Fork Join Pool- common pool : executes the parallel tasks:
		// breaks task into two. throws one into the pool. process other by itself.
		
			stream
			.parallel()
			.map(e -> transformWithDebug(e))
			.forEach(e -> {});
	}

	private static Object transformWithDebug(Integer e) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
	
		System.out.println(e + " processed by : " + Thread.currentThread());
		return e * 1;
	}
}
