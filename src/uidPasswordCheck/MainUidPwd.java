package uidPasswordCheck;

public class MainUidPwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidationOfUserIdPassword validationOfUserIdPassword = new ValidationOfUserIdPassword();

		validationOfUserIdPassword.defaultUserId = "pivotAdmin";
		validationOfUserIdPassword.defaultPassword = "Admin123";
		validationOfUserIdPassword.matchUserIdAndPassword();

	}
}
