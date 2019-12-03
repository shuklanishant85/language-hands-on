package com.codility.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodilityTest {
	public static void main(String[] args) {
		int[] a = {1, 3, 6, 4, 1, 2}; 
		System.out.println(new CodilityTest().solution(a));
	}
	
	public int solution(int[] a) {
		List<Integer> list = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i-1) < 0 ) {
				continue;
			} else {
				if (i < list.get(i-1)) {
					return i;
				}
			}
		}
		return list.size()+1; 
    }

}
