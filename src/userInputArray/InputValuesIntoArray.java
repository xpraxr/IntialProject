package userInputArray;

import java.util.Scanner;

public class InputValuesIntoArray {
	
		Scanner scanner = new Scanner(System.in);	
		int noOfValue;
		
		int[] storage = new int[noOfValue];
		
	void arrayLength() {
	
		System.out.println("Enter how many vlues to add:");
		noOfValue = scanner.nextInt();
	}
	void populateNumbers() {			
		System.out.println("Now enter the numberical elements:");
		for (int i = 0; i < noOfValue; i++) {
			storage[i] = scanner.nextInt();
		}
	}
	void displayNumbers() {
		System.out.println("The entered elements are");
		for (int i = 0; i < noOfValue; i++) {
			System.out.println(storage[i]);
		}
	}
}
