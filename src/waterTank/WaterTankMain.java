package waterTank;

public class WaterTankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FillTankMechanism fillTankMechanism = new FillTankMechanism();
		
		fillTankMechanism.defaultInitialWater = 2;
		fillTankMechanism.defaultTankCapacity = 100;
		fillTankMechanism.defaultHeadspace = 3;
		fillTankMechanism.defaultbucketCapacity = 16;
		
		
		
		fillTankMechanism.initialPrint();
		fillTankMechanism.addWaterToTank();
	}
}
