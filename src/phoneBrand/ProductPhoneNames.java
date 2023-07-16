package phoneBrand;

import java.util.Scanner;

public class ProductPhoneNames {

	String[] Samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] Google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] Apple = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 10" };

	Scanner scanner = new Scanner(System.in);

	void displayBrandNames() {

		System.out.println("Choose a Phone brand Name from one of these to list the products: "
				+ "\r1. Samsung \r2. Google \r3. Apple");
		String userBrandInput = scanner.next();

		if (userBrandInput.equalsIgnoreCase("samsung")) {
			for (int i = 0; i < Samsung.length; i++) {
				System.out.println(Samsung[i]);
			}
		} else if (userBrandInput.equalsIgnoreCase("google")) {
			for (int i = 0; i < Google.length; i++) {
				System.out.println(Google[i]);
			}
		} else if (userBrandInput.equalsIgnoreCase("apple")) {
			for (int i = 0; i < Apple.length; i++) {
				System.out.println(Apple[i]);
			}
		} else {
			System.out.println("Kindy type in the correct Brand name.");
			System.exit(0);
		}
	}

	
	String phoneName;
	
	void displayPhoneNames() {
		boolean phoneFound = false;
		
		System.out.println("Enter one of the Phone name:");
		String userProductInput = scanner.next();

		for (int j = 0; j < Samsung.length; j++) {
			if (Samsung[j].equalsIgnoreCase(userProductInput)) {
				phoneName = Samsung[j];
				phoneFound = true;
				break;
			}
		}

		if (phoneFound)
			System.out.println("Phone name: " + phoneName + " found ");
		else
			System.out.println("Phone not found, Kindly type in again!!");
	}
}
