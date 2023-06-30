package firstPackage;

public class Laptop {
	
	String brand;
	String model;
	float screenSize;
	int noOfPorts;
	boolean touchScreen;
	
	
	void display() {
		System.out.println ("This is laptop of screen size "+screenSize+" inches");
	}
	
	void details() {
		System.out.println ("brand name:"+brand+"model no:"+model);
	}
	
	

}
