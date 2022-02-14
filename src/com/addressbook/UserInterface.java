package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	Scanner scanner = new Scanner(System.in);
	private static UserInterface instance;

	private UserInterface() {

	}

	public static UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void print(ArrayList<Address> addressList) {
		for (Object address : addressList) {
			System.out.println(address);
		}
	}

	public int showMainMenu() {
		System.out.println("Select");
		System.out.println("1. Add \n2. Remove \n" + "3. Print \n4. Update \n5. Exit  ");
		int choice = scanner.nextInt();
		return choice;
	}

	public String selectAddress() {
		System.out.println("Enter the name of address : ");
		String userSelection = scanner.next();
		return userSelection;
	}

	public int showUpdateMenu() {
		System.out.println("Select");
		System.out.println("1. Update Name \n2. Update address\n 5. Exit  ");
		int updateChoice = scanner.nextInt();
		return updateChoice;
	}
}
