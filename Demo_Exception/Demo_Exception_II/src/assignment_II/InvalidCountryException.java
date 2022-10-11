package assignment_II;

public class InvalidCountryException extends Exception {

	private String msg;
	
	public InvalidCountryException() {
		msg = "User Outside India cannot be registered";
	}
	
	public String getMessage() {
		return msg;
	}
}
