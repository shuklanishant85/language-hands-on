package com.ds.linkedlist;

public class ListNode {
	private int data;
	private ListNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public boolean hasNext() {
		return this.next != null ? true : false;
	}

}
