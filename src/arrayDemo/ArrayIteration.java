package arrayDemo;

import java.util.Scanner;

public class ArrayIteration {
	int[] numArray = { 1, 2, 3, 4, 5 };

	String[] names = new String[5];

	Scanner sc = new Scanner(System.in);

	void populateNameArray() {
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name: " + (i + 1));
			names[i] = sc.next();
		}
	}

	void printNames() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// Find the entered name if present in the array
	
	int j;
	void findNameInArray() {
		Boolean flag = false;

		String enteredName;
		System.out.println("Enter the name you want to search");
		enteredName = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(enteredName)) {
				flag = true;
				j++;
			}
		}

		if (flag)
			System.out.println(enteredName+" name is present " + j + " times in the array");
		else
			System.out.println("Name is not present in the array");
	}

}
