package userInputSwitch;

import java.util.Scanner;

public class ArithmeticOperation {

	int value1, value2, finalValue;
	Scanner scanner = new Scanner(System.in);

	void addition() {
		finalValue = value1 + value2;
		System.out.println("Final Value: " + finalValue);
	}

	void subtraction() {
		finalValue = value1 - value2;
		System.out.println("Final Value: " + finalValue);
	}

	void multiply() {
		finalValue = value1 - value2;
		System.out.println("Final Value: " + finalValue);
	}

	void quotient() {
		if (value2 != 0) {
			finalValue = value1 / value2;
			System.out.println("Final Value: " + finalValue);
		} else
			System.out.println("Not able to divide by zero");
	}

	void reminder() {
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

			System.out.print("Enter value 1 & value 2: ");
			value1 = scanner.nextInt();
			value2 = scanner.nextInt();

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
