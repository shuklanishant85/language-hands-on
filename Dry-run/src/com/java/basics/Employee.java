package com.java.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class Employee {

	private int id;
	private String name;
	private HashMap<String, String> skillMap;

	public Employee(int id, String name, Map<String, String> skillMap) {
		this.id = id;
		this.name = name;
		HashMap<String, String> newSkillMap = new HashMap<>();
		for (Entry<String, String> entry : skillMap.entrySet()) {
			newSkillMap.put(entry.getKey(), entry.getValue());
		}
		this.skillMap = newSkillMap;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getSkillMap() {
		return (HashMap<String, String>) skillMap.clone();
	}

}
