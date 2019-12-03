package com.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Address implements Cloneable {

	int houseNo;
	String city;
	String state;
	long pinCode;


	public Address(int houseNo, String city, String state, long pinCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public Address clone() {
		return new Address(this.houseNo, this.city, this.state, this.pinCode);
	}

	static Comparator<Address> houseNoComparator = (Address a, Address b) -> {
		return a.houseNo - b.houseNo;
	};

	public static void main(String[] args) {
		List<Address> addresses = new ArrayList<>();
		addresses.add(new Address(12, "delhi1", "", 12345));
		addresses.add(new Address(45, "delhi2", "", 12345));
		addresses.add(new Address(2, "delhi3", "", 12345));
		addresses.add(new Address(13, "delhi4", "", 12345));
		Collections.sort(addresses, houseNoComparator);

		for (Address address : addresses) {
			System.out.println(address.houseNo);
		}

	}

}
