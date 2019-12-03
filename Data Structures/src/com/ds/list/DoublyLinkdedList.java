package com.ds.list;

class DLLNode<T> {
	T data;
	DLLNode<T> next;
	DLLNode<T> prev;

	public DLLNode(T data, DLLNode<T> next, DLLNode<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLLNode<T> getNext() {
		return next;
	}

	public void setNext(DLLNode<T> next) {
		this.next = next;
	}

	public DLLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DLLNode<T> prev) {
		this.prev = prev;
	}
}

public class DoublyLinkdedList<T> {

	DLLNode<T> head;
	DLLNode<T> tail;
	int length;

	public DoublyLinkdedList() {
		length = 0;
	}

	public synchronized DLLNode<T> getHead() {
		return head;
	}

	public synchronized DLLNode<T> getTail() {
		return tail;
	}

	public synchronized int getPosition(T data) {
		DLLNode<T> current = head;
		int position = 0;
		while (current.getNext() != null) {
			if (current.getData().equals(data)) {
				return position;
			}
			current = current.getNext();
			position++;
		}
		return -1;
	}

	public synchronized void insert(T data) {
		if (head == null) {
			head = new DLLNode<T>(data, null, null);
			tail = head;
			length++;
		} else {
			DLLNode<T> newNode = new DLLNode<>(data, head, null);
			head.setPrev(newNode);
			head = newNode;
			length++;
		}
	}

	public synchronized void insert(T data, int position) {
		if (head == null) {
			head = new DLLNode<>(data, null, null);
			tail = head;
			length++;
		} else if (position > length) {
			DLLNode<T> newNode = new DLLNode<>(data, null, tail);
			tail.setNext(newNode);
			tail = newNode;
			length++;
		} else {
			DLLNode<T> current = head;
			for (int i = 1; i < position-1; i++) {
				current = current.getNext();
			}
			DLLNode<T> newNode = new DLLNode<>(data, current.getNext(), current);
			current.getNext().setPrev(newNode);
			current.setNext(newNode);
			length++;
		}
	}

	public synchronized DLLNode<T> delete(int position) {
		DLLNode<T> temp = head;
		if (position == 0) {
			head.getNext().setPrev(null);
			head = head.getNext();
			length--;
		} else if (position == length) {
			temp = tail;
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
			length--;
		} else {
			for (int i = 1; i < position-1; i++) {
				temp=temp.getNext();
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				length--;
			}
		}
		return temp;

	}
	
	public synchronized void printList() {
		DLLNode<T> current = head;
		System.out.print("HEAD --> NULL <--> ");
		System.out.print("[" + current.getData() + "] <--> ");
		while (current.getNext() != null) {
			current = current.getNext();
			System.out.print("[" + current.getData() + "] <--> ");
		}
		System.out.println(" NULL <-- TAIL");
	}

}
