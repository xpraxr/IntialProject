package discountApply;

import java.util.Scanner;

public class discountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		Scanner sc = new Scanner(System.in);
		discountCalc dc = new discountCalc();
		
		System.out.println("Enter the price of the Product:");
		num = sc.nextDouble();
		dc.price = num * .5;
		
		System.out.println("Enter promocode for either 5%,10% or 20% for the additional discount on the price");
		System.out.print("Promo");
		
		dc.promoCode = sc.nextByte();
		dc.calcDisc();

	}

}
