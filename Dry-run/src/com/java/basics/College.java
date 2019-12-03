package com.java.basics;

public class College {

	// instance variables
	private int collegeCode;
	private String collegeName;
	private Student student[];
	private Address address ;



	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	static {

	}

	public College(int collegeCode, String collegeName, Student[] student, Address address) {
		super();
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.student = student;
		this.address = address;
	}

	public static void main(String[] args) {

	}

	public College createCollage() {
		//local variable in method block
		address = new Address(123, "", "", 123);
		College college = new College(collegeCode, collegeName, student, address);
		return college;
	}


}
