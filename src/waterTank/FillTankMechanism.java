package waterTank;

public class FillTankMechanism {

	int defaultInitialWater;
	int initialWater;
	int defaultTankCapacity;
	int defaultHeadspace;
	int fillableTankCapacity; 
	int defaultbucketCapacity;

	int round = 0;
	int bucketCapture = 0;

	void initialPrint() {
		initialWater = defaultInitialWater;
	fillableTankCapacity = defaultTankCapacity - (defaultHeadspace + initialWater);
	System.out.println("Initial residual water in the tank being "+defaultInitialWater+"L \nwith a headspace of "+defaultHeadspace+"L \nwhere actual amount of water that can be filled is "+fillableTankCapacity+"L\n");
	}
	void addWaterToTank() {

	while(defaultInitialWater<=(defaultTankCapacity-defaultHeadspace))
	{

		System.out.println("Amount of Water left in tank is " + defaultInitialWater + "L" + " including residual");

		round++;

		defaultInitialWater += defaultbucketCapacity;

		if (defaultInitialWater <= (defaultTankCapacity - defaultHeadspace))
			if (round == 1)
				System.out.println(round + "st round of " + defaultbucketCapacity + "L Bucket");
			else if (round == 2)
				System.out.println(round + "nd round of " + defaultbucketCapacity + "L Bucket");
			else if (round == 3)
				System.out.println(round + "rd round of " + defaultbucketCapacity + "L Bucket");
			else
				System.out.println(round + "th round of " + defaultbucketCapacity + "L Bucket");

		bucketCapture += defaultbucketCapacity;

	}

	if(defaultbucketCapacity>fillableTankCapacity)
		System.out.println("Overflow!!");
	else 
		System.out.println("\nTank gets to overflow with additional "+defaultbucketCapacity+"L bucket");

	if(defaultbucketCapacity<=fillableTankCapacity)
	{
		if (bucketCapture > fillableTankCapacity) {
			bucketCapture -= defaultbucketCapacity;
			System.out.println("\nbeing left to fill "
					+ (fillableTankCapacity + initialWater - (bucketCapture + initialWater)) + "L");
		}
	}else System.out.println("Bucket Size big only allowed size is "+fillableTankCapacity+"L"+"\nbut here bucket size being "+defaultbucketCapacity+"L");

	System.out.println("\nNote: Maximum water the tank can hold"+"\n   including any left over to fill will be "+(initialWater+fillableTankCapacity)+"L");
}
}
