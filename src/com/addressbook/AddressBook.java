package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
	private static AddressBook instance;
	private ArrayList<Address> addressList = new ArrayList<Address>();

	private AddressBook() {

	}

	public static AddressBook getInstance() {
		if (instance == null) {
			instance = new AddressBook();
		}
		return instance;
	}

	public void add(Address address) {
		addressList.add(address);
	}

	public void remove(Address address) {
		addressList.remove(address);
	}

	public ArrayList<Address> getAddressList() {
		return addressList;
	}

	public Address getAddress(String name) {
		for (Address address : addressList) {
			if (name.equals(address.name)) {
				return address;
			}
		}
		return null;
	}

}
