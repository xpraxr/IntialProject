package wellnessChecker;


public class BmiBmrCalc {

	float weightInPounds = 220.46f;
	float heightInInches = 68.89f;
	
//	double weightInPounds = 220.46;
//	double heightInInches = 68.89;
	double bmi; //BodyMassIndex // ideal 18.5-24.9
	double bmr; // BasalMetabolicRate 
	char genderMF = 'M';
	byte age = 30;
	
	void calcBmi() {
		bmi = 703 * (weightInPounds / (heightInInches*heightInInches)); // Imperial System BMI Formula
		System.out.println("Value of BMI:"+bmi);
	}
	
	void calcBmr() {
		
		if ( genderMF == 'M')
		{
			bmr = 66.47 + 
					(6.24 * weightInPounds) + 
					(12.7 * heightInInches) -
					(6.755 * age);  // Harris-Benedict BMR Formula
		}else {
			bmr = 655.1 + 
					(4.35 * weightInPounds) + 
					(4.7 * heightInInches) -
					(4.7 * age); 
		}
		System.out.println(" BMR of "+bmr+" calories per day");
	}
	
}
