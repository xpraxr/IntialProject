package uidPasswordCheck;

public class ValidationUidPwd {

	String defaultUid = "pivotAdmin";
	String defaultPwd = "Admin123";
	String inputUid, inputPwd;
	byte breakout = 0;

	void uidpwdCheck() {
		if (defaultUid.equals(inputUid) && (defaultPwd.equals(inputPwd))) {
			breakout = 1;
			System.out.println("You are logged in to the application");
		} else
			System.out.println("Incorrect User id or password. Try again");
	}
}
