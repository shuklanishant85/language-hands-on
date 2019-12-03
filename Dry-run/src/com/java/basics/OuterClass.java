package com.java.basics;

import java.io.Serializable;

public class OuterClass implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 7348105743502106419L;
	public String outer = "outer";

	public void print(int... arr) {
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public void createInnerClass() {
		class MethodInnerClass {
			public String methodInnerClassVariable = "method Inner Class Variable";
			// method inner classes cannot be PUBLIC
		}
		System.out.println(new MethodInnerClass().methodInnerClassVariable);
	}

	public class InnerClass {
		public String innerClassVariable = "inner class variable";
		public void print() {
			System.out.println(new InnerClass().innerClassVariable);
		}
	}

	public static class StaticInnerClass {
		public String staticInnerClassVariable = "staticInnerClassVariable";

		public void print() {
			System.out.println(new StaticInnerClass().staticInnerClassVariable);
		}
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.print();

		OuterClass.StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.print();

		outerClass.createInnerClass();
	}

	enum Enum {
		ENUM1(1, "en1"), ENUM2(2, "en2");
		private int code;
		private String name;

		Enum(int code, String name) {
			this.code = code;
		}

	}

}
