package wellnessChecker;

import java.util.Scanner;

public class WellnessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BmiBmrCalc obj = new BmiBmrCalc();

			
//		    obj.weightInPounds = 220.46f;
//			obj.heightInInches = 68.89f;
//			obj.genderMF = 'M';
//			obj.age = 30;
			
			
			Scanner sc  = new Scanner(System.in);
			//obj.genderMF = sc.
			System.out.println("Age:");
			obj.age = sc.nextByte();
			System.out.println("Height in inches:");
			obj.heightInInches = sc.nextFloat();
			System.out.println("Weight in pounds:");
			obj.weightInPounds = sc.nextFloat();
			
			obj.calcBmi();
			obj.calcBmr();
	}

}
