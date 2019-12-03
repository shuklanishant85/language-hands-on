package com.ds.linkedlist;

import com.ds.linkedlist.ListNode;

public class Runner {
	public static void main(String[] args) {
		Long start;
		Long end;
		
		start = System.nanoTime();
		init();
		end = System.nanoTime();
		System.out.println("processing time :: "+(end-start)/1000000+" millisec");

	}

	private static void init() {
		LinkedList list = create();
		System.out.print("[");
		ListNode current = list.getHead();
		do {
			System.out.print(current.getData() + "],[");
			current = current.getNext();
		} while (current.hasNext());
		System.out.println(LinkedListUtils.getEndNode(list.getHead()).getData()+"]");
	}

	public static LinkedList create() {
		LinkedList list = new LinkedList();
		ListNode node;
		for (int i = 0; i < 10000; i++) {
			node = new ListNode();
			node.setData(i);
			list.insertNode(node, i);
		}
		return list;
	}
}
