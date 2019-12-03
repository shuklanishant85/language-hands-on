package com.java.basics;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().forEach(x -> System.out.println(x));
		int sum = list.stream().filter(x -> (x % 2 != 0)).reduce(0, Integer::sum);
		System.out.println("sum of odd values: " + sum);

	}

}
