package ontarioLicense;

import java.util.Scanner;

public class IssueLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EligibilityCheck ec = new EligibilityCheck();

		System.out.println("Enter your name:");
		ec.nameOfApplicant = sc.nextLine();

		System.out.println("Enter the Age in numbers:");
		ec.ageForLicense = sc.nextByte();

		System.out.println("Enter The level of your G ex:" + "\n" + "1 for G1" + "\n" + "2 for G2" + "\n" + "0 for G");
		ec.levelForLicense = sc.nextByte();

		ec.checkInputsForLicense();

	}

}
