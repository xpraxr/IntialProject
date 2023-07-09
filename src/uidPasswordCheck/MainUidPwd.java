package uidPasswordCheck;

import java.util.Scanner;

public class MainUidPwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte chance = 1;
		Scanner sc = new Scanner(System.in);
		ValidationUidPwd vup = new ValidationUidPwd();
		while (chance <= 3) {
			System.out.println("Enter UserId:");
			vup.inputUid = sc.nextLine();
			System.out.println("Enter Password:");
			vup.inputPwd = sc.nextLine();
			vup.uidpwdCheck();
			if (vup.breakout == 1) {
				break; // +ve break
			}
			if (chance == 3) {
				System.out.println("Account locked");
				break; // -ve break
			}
//			System.out.println("Attempt:" +i);
			chance += 1;
		}
	}
}
