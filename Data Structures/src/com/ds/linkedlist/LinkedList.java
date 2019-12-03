package com.ds.linkedlist;

import com.ds.linkedlist.ListNode;

public class LinkedList {
	private int length;
	private ListNode head;

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public LinkedList() {
		length = 0;
	}

	/**
	 * This method inserts a given node at given position in the Linked List.
	 * 
	 * @param newNode
	 * @param position
	 */
	public void insertNode(ListNode newNode, int position) {
		if (head != null) {
			if (position <= 0) {
				newNode.setNext(head);
				head = newNode;
			} else if (position >= LinkedListUtils.listLength(head)) {
				LinkedListUtils.getEndNode(head).setNext(newNode);
				newNode.setNext(null);
			} else {
				newNode.setNext(LinkedListUtils.getNodeAtPoision(head, position));
				LinkedListUtils.getNodeAtPoision(head, position - 1).setNext(newNode);
			}

		} else {
			head = newNode;
		}
	}

	/**
	 * This method deletes a node at a given position from Linked List.
	 * 
	 * @param position
	 */
	public ListNode deleteNode(int position) {
		ListNode current = head;
		ListNode prev = head;
		if (position <= 0) {
			head = head.getNext();
			return current;
		} else if (position >= this.getLength()) {
			while (current.hasNext()) {
				prev = current;
				current = current.getNext();
			}
			prev.setNext(null);
			return current;
		} else {
			current = LinkedListUtils.getNodeAtPoision(head, position);
			prev = LinkedListUtils.getNodeAtPoision(head, position - 1);
			prev.setNext(current.getNext());
			return current;
		}

	}

}
