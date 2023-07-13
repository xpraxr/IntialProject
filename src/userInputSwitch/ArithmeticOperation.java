package userInputSwitch;

import java.util.Scanner;

public class ArithmeticOperation {
	
	
	int value1, value2, finalValue;
	Scanner scanner = new Scanner(System.in);

	void addition() {
		System.out.print("Enter value 1 & value 2: ");
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		finalValue = value1 + value2;
		System.out.println("Final Value: " + finalValue);
	}

	void subtraction() {
		System.out.print("Enter value 1 & value 2: ");
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		finalValue = value1 - value2;
		System.out.println("Final Value: " + finalValue);
	}

	void multiply() {
		System.out.print("Enter value 1 & value 2: ");
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		finalValue = value1 - value2;
		System.out.println("Final Value: " + finalValue);
	}

	void quotient() {
		System.out.print("Enter value 1 & value 2: ");
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		if (value2 != 0) {
			finalValue = value1 / value2;
			System.out.println("Final Value: " + finalValue);
		} else
			System.out.println("Not able to divide by zero");
	}

	void reminder() {
		System.out.print("Enter value 1 & value 2: ");
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		if (value2 != 0) {
			finalValue = value1 / value2;
			System.out.println("Final Value: " + finalValue);
		} else
			System.out.println("Not able to divide by zero");
	}

	void oprationOfChoice() {
		String userInput;
		do {
			System.out.println("Enter input '+' to add ," + "'-' to sub ," + "'*' to mult ," + "'/' for quotient,"
					+ "'%' for reminder & " + "'Q' to Quit :");

			userInput = scanner.next();

			switch (userInput) {
			case "+":
				addition();
				break;
			case "-":
				subtraction();
				break;
			case "*":
				multiply();
				break;
			case "/":
				quotient();
				break;
			case "%":
				reminder();
				break;
			case "Q":
				userInput = "Q";
				break;
			default:
				System.out.println("Invalid input, Try again");
			}

		} while (userInput != "Q");

		System.out.println("Quit");
	}

}
