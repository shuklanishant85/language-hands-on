package com.ds.list;

public class Runner {
	public static void main(String[] args) {
		GenericLinkedList<String> books = new GenericLinkedList<>();
		books.insert("history of india");
		books.insert("geography of india", 1);
		books.insert("physics book");
		books.insert("chem book", 2);
		books.printList();
		
		GenericLinkedList<Integer> account = new GenericLinkedList<>();
		account.insert(250);
		account.insert(500);
		account.insert(700);
		account.insert(1000);
		account.printList();
		
		DoublyLinkdedList<Integer> id = new DoublyLinkdedList<>();
		id.insert(100);
		id.insert(200);
		id.insert(300);
		id.insert(400,3);
		id.printList();
	}
}
