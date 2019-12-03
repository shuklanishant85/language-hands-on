package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionsAPI {

	public static void main(String[] args) {
		// SetAPI.hashSetWorker();
		// SetAPI.linkedHashSetWorker();
		// QueueAPI.priorityQueueWorker();
		ListAPI.listWorker();
	}
}

class SetAPI {
	public static void hashSetWorker() {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(4);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		Integer[] setToArray = hashSet.toArray(new Integer[5]);
		Arrays.sort(setToArray);
		for (Integer integer : setToArray) {
			System.out.println(integer);
		}
		System.out
		.println("Searching 6 in set : position :: " + Collections.binarySearch(Arrays.asList(setToArray), 6));
	}

	public static void linkedHashSetWorker() {
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(5);
		linkedHashSet.add(4);
		linkedHashSet.add(1);
		linkedHashSet.add(3);
		linkedHashSet.add(2);
		linkedHashSet.add(null);
		for (Integer integer : linkedHashSet) {
			System.out.println(integer);
		}
	}

}

class QueueAPI {
	public static void priorityQueueWorker() {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(5);
		priorityQueue.offer(4);
		priorityQueue.offer(1);
		priorityQueue.offer(3);
		priorityQueue.offer(2);
		// priorityQueue.offer(null);
		for (Integer integer : priorityQueue) {
			System.out.println(integer);
		}
	}

}

class ListAPI {
	public static void listWorker() {

		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		List<Integer> newList = new ArrayList<>(list);
		for (Integer integer : list) {
			System.out.println("item : " + integer);
		}
		newList.remove(0);
	}

}
