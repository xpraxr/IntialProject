package chocolates5And27;

public class MechanismChocolateAddition {

	byte initialAmountOfChocolate = 27;
	byte noOfChocolatesAdded = 5;
	byte count, totalChocolatesadded;
	byte chocolateBoxLimit = 63;

	void fiveChocolateAdd() {
		while (initialAmountOfChocolate <= chocolateBoxLimit) {
			totalChocolatesadded = initialAmountOfChocolate;
			initialAmountOfChocolate += noOfChocolatesAdded;

			if (initialAmountOfChocolate > chocolateBoxLimit) {
				System.out.println("The next set of " + noOfChocolatesAdded + " chocolates leads to "
						+ initialAmountOfChocolate
						+ " chocoltes in total, but can't be added since it exceeds the limit " + chocolateBoxLimit);
				break;
			}

			count += 1;

			System.out.println(
					count + " round chocolates added, leaving " + initialAmountOfChocolate + " in total in the box");
		}
		System.out.println("Total Chocoltes added:" + totalChocolatesadded);
	}
}
