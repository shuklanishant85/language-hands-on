package com.ds.list;

class ListNode<T> {
	private T data;
	private ListNode<T> next;

	public ListNode(T data, ListNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

}

public class GenericLinkedList<T> {
	ListNode<T> head;
	int length;

	public GenericLinkedList() {
		length = 0;
	}

	public synchronized ListNode<T> getHead() {
		return head;
	}

	public synchronized void insert(T data) {
		if (head == null) {
			head = new ListNode<T>(data, null);
			length++;
		} else {
			head = new ListNode<T>(data, head);
			length++;
		}
	}

	public synchronized void insert(T data, int position) {
		ListNode<T> current = head;
		if (head == null) {
			head = new ListNode<T>(data, null);
			length++;
		} else if (position >= length) {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new ListNode<T>(data, null));
			length++;
		} else {
			for (int i = 1; i < position-1; i++) {
				current = current.getNext();
			}
			current.setNext(new ListNode<T>(data, current.getNext()));
			length++;
		}
	}

	public synchronized ListNode<T> delete(int position) {
		ListNode<T> current = head;
		ListNode<T> prev = head;
		if (position > length | head == null) {
			return null;
		} else {
			for (int i = 1; i < position-1; i++) {
				prev = current;
				current = current.getNext();
			}
			if (position == length) {
				prev.setNext(null);
				length--;
				return current;
			} else {
				prev.setNext(current.getNext());
				length--;
				return current;
			}
		}
	}

	public synchronized void deleteList() {
		head = null;
		length = 0;
	}

	public synchronized ListNode<T> getNode(int position) {
		if (head != null && position < length) {
			ListNode<T> current = head;
			for (int i = 0; i < position; i++) {
				current = current.getNext();
			}
			return current;
		} else {
			return null;
		}
	}

	public synchronized void printList() {
		ListNode<T> current = head;
		System.out.print("HEAD --> ");
		System.out.print("[" + current.getData() + "] --> ");
		while (current.getNext() != null) {
			current = current.getNext();
			System.out.print("[" + current.getData() + "] --> ");

		}
		System.out.println(" NULL");
	}

}
