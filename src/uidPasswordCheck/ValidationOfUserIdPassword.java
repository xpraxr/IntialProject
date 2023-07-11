package uidPasswordCheck;

import java.util.Scanner;

public class ValidationOfUserIdPassword {

	String defaultUserId;
	String defaultPassword;
	String inputUserId;
	String inputPassword;
	int chancesToTry = 3;
	int count = 0;

	Scanner scanner = new Scanner(System.in);

	void inputUserAndPassword() {
		System.out.println("Enter UserId:");
		inputUserId = scanner.nextLine();
		System.out.println("Enter Password:");
		inputPassword = scanner.nextLine();
	}

	void matchUserIdAndPassword() {
		while (count < chancesToTry) {
			count++;
			inputUserAndPassword();
			if (defaultUserId.equals(inputUserId) && (defaultPassword.equals(inputPassword))) {
				System.out.println("You are logged in to the application");
				break;

			} else if (count < chancesToTry) {
				System.out.println(chancesToTry - count + " Try left");
				System.out.println("Incorrect User id or password. Try again");

			} else
				System.out.println("Account locked");
		}
	}
}
