package com.addressbook;

public abstract class Address {
	String name;
	String address;
	
	@Override
	public String toString() {
		return "Address [Name=" + name + ", Address=" + address + "]";
	}
}
