package chocolates5And27;

public class MechanismChocolateAddition {

	byte begin = 27;
	byte add = 5;
	byte count, total;

	void fiveChocolateAdd() {
		while (begin <= 63) {
			total = begin;
			begin += 5;

			if (begin > 63) {
				System.out.println("The next set of 5 chocolates leads to " + begin
						+ " chocoltes in total, but can't be added since it exceeds the limit 63");
				break;
			}

			count += 1;

			System.out.println(count + " round chocolates added, leaving " + begin + " in total in the box");
		}
		System.out.println("Total Chocoltes added:" + total);
	}
}
