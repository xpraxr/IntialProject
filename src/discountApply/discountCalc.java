package discountApply;

public class discountCalc {

	byte promoCode;
	double price, promoDiscount, finalDiscountedValue;
	//? didn't take *.5;
	void calcDisc() {
		if (promoCode == 5 || promoCode == 10 || promoCode == 20) {
			if (promoCode == 5) {
				promoDiscount = price * .05;
			}
			if (promoCode == 10) {
				promoDiscount = price * .1;
			}
			if (promoCode == 20) {
				promoDiscount = price * .2;
			}
			finalDiscountedValue = price - promoDiscount;
			System.out.println(
					"Discounted " + promoCode + "% on 50% Inital Discount, Final Price: " + finalDiscountedValue);
		} else
			System.out.println("No promoCode applied. The Basic Discount Applied, Final Price: " + price);

	}

}
