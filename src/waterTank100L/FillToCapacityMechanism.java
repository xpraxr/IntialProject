package waterTank100L;

public class FillToCapacityMechanism {

	int initialAmountOfWater, count;
	int bucketCapacity = 10;
	int tankCapacity = 100;
	int actualTankCapacity = tankCapacity - 5;

	void tenLitreAdd() {
		while (initialAmountOfWater <= actualTankCapacity) {
			initialAmountOfWater += bucketCapacity;
			if (initialAmountOfWater > actualTankCapacity) {
				System.out.println("The Tank is full now!!");
				break;
			}
			count++;
			System.out.println(count + " bucket of " + bucketCapacity + "L added, having total of "
					+ initialAmountOfWater + "L water in the WaterTank ");
		}

	}
}
