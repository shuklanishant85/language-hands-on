package com.java.basics;

public class InheritanceMain {
	public static void main(String[] args) {
		
		//Autonomous inner type object creation
		Animal animal = new Animal() {
			@Override
			void run() {
				System.out.println("Aniaml is running...");
			}
		};
		animal.run();
		animal.eat();
		animal.speak();
		System.out.println("------------------------------------------");
		
		// Upcasting
		Animal anotherAnimal = new Dog();
		anotherAnimal.run();
		anotherAnimal.eat();
		anotherAnimal.speak();
		System.out.println("------------------------------------------");

		//DownCasting
		
		Animal dogAnimal = new Animal() {
			
			@Override
			void run() {
				System.out.println("dog is running");
			}
		};
		Dog dog = (Dog) dogAnimal;
		dog.eat();
		dog.run();
		dog.speak();
		System.out.println("--------------------------------------------");
	}
}
