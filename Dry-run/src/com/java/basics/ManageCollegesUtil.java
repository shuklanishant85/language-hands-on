package com.java.basics;

public class ManageCollegesUtil {
	static String data;

	private ManageCollegesUtil() {
		//do nothing
	}
	
	public static String doSomething() {
		String name = data;
		if (name == null) {
			name ="";
		}
		name = "this is static " + name;
		return name;
	}
	
}
