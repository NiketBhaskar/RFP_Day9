package com.addressbook;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);

	public void handleUserSelection(int choice) {
		AddressBook addressBook = AddressBook.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		switch (choice) {
		case 1:
			addAddress();
			break;
		case 2:
			String userSelection = userInterface.selectAddress();
			Address address = addressBook.getAddress(userSelection);
			addressBook.remove(address);
			break;
		case 3:
			userInterface.print(addressBook.getAddressList());
			break;
		case 4:
			String addressName = userInterface.selectAddress();
			Address addressForUpdate = addressBook.getAddress(addressName);

			int updateChoice = userInterface.showUpdateMenu();
			updateAddress(addressForUpdate, updateChoice);
			break;
		case 5:
			System.exit(0);
			break;
		default:

		}
	}

	public void addAddress() {
		AddressBook addressBook = AddressBook.getInstance();

		AddressOne addressOne = new AddressOne();
		AddressTwo addressTwo = new AddressTwo();

		addressBook.add(addressOne);
		addressBook.add(addressTwo);
	}

	public void updateAddress(Address addressForUpdate, int updateChoice) {

		switch (updateChoice) {
		case 1:
			System.out.println("Current Name is : " + addressForUpdate.name + ". Enter your new name :");
			String newName = scanner.next();
			if (addressForUpdate.name == newName) {
				System.out.println("Already Having This Name");
				break;
			}
			addressForUpdate.name = newName;
			break;
		case 2:
			addressForUpdate.address = scanner.next();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

	public static void main(String[] args) {
		UserInterface userInterface = UserInterface.getInstance();

		Main main = new Main();

		int choice = 0;
		while (choice != 5) {
			choice = userInterface.showMainMenu();
			main.handleUserSelection(choice);
		}
	}

}
