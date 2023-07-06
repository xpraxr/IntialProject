package ontarioLicense;

public class EligibilityCheck {
	byte levelForLicense, ageForLicense;
	String nameOfApplicant;

	void checkInputsForLicense() {
		if (ageForLicense >= 16) {
			if (levelForLicense == 1 || levelForLicense == 2 || levelForLicense == 0) {
				if (levelForLicense == 1) {
					System.out.println(nameOfApplicant + " having G" + levelForLicense
							+ " is eligible for G2 & G; eligibility for G license can get in by 8 months from the day you get your G2");
				}
				if (levelForLicense == 2) {
					System.out.println(nameOfApplicant + " having G" + levelForLicense
							+ " is eligible for G license can get in by 8 months from the day you get your G2");
				}
				if (levelForLicense == 0) {
					System.out.println(nameOfApplicant + " G license is issued");
				}
			} else
				System.out.println("License can't be issued, have to take the G1 Test.");

		} else {
			System.out.println("Can't issue license due to under age");

		}
	}
}
