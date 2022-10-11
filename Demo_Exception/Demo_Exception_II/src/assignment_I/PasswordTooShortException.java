package assignment_I;

public class PasswordTooShortException extends Exception {

	private String msg;

	public PasswordTooShortException() {
		msg = "Password should be more than 8 characters";
	}

	public String getMessage() {
		return msg;
	}
}