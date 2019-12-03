package com.ds.linkedlist;

import com.ds.linkedlist.ListNode;

public class LinkedListUtils {

	private LinkedListUtils() {
		// do nothing
	}

	/**
	 * This method returns the length of a linked list with given head node.
	 * 
	 * @param head
	 * @return
	 */
	public static int listLength(ListNode head) {
		int count = 0;
		ListNode current = head;
		while (current.hasNext()) {
			current = current.getNext();
			count++;
		}
		return count;
	}

	/**
	 * This method returns the end node of given Linked List.
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode getEndNode(ListNode head) {
		ListNode current = head;
		while (current.hasNext()) {
			current = current.getNext();
		}
		return current;
	}

	/**
	 * This method returns the node at given position in a Linked List.
	 * 
	 * @param head
	 * @param position
	 * @return
	 */
	public static ListNode getNodeAtPoision(ListNode head, int position) {
		int count = 0;
		ListNode node = head;
		while (count < position) {
			node = node.getNext();
		}
		return node;
	}
}
