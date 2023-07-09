package waterTank100L;

public class FillToCapacityMechanism {

	byte begin, count;
	byte add = 10;

	void tenLitreAdd() {
		while (begin <= 100) {
			begin += 10;
			if (begin > 100) {
				System.out.println("The Tank is full now!!");
				break;
			}
			count += 1;
			System.out.println(count + " bucket of 10L added, having total of " + begin + "L water in the WaterTank ");
		}

	}
}
