package com.java.basics;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private Address adders;
	private String stream;

	public Student(int id, String name, Address adders, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.adders = adders;
		this.stream = stream;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdders() {
		return adders;
	}

	public void setAdders(Address adders) {
		this.adders = adders;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student(4, "nishant2", null, "java1");
		students[1] = new Student(3, "nishant3", null, "java2");
		students[2] = new Student(2, "nishant1", null, "java3");
		students[3] = new Student(1, "nishant4", null, "java4");

		Arrays.sort(students);

		for (Student student : students) {
			System.out.println(student.id);
		}

		Arrays.sort(students, Student.nameComparator);

		for (Student student : students) {
			System.out.println(student.name);
		}

	}

	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}

	static Comparator<Student> nameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	};

}
