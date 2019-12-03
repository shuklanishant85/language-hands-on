package com.java.basics;

public class Dog extends Animal{

	@Override
	void run() {
		System.out.println("Dog is running..");
	}
	
	void speak() {
		System.out.println("dog is barking...");
	}
	void hunt() {
		System.out.println("dog is hunting...");
	}

}
