package assignment_III;

public class InvalidColourException extends Exception {

	private String msg;

	public InvalidColourException() {
		msg = "color not available";
	}

	public String getMessage() {
		return msg;
	}
}
