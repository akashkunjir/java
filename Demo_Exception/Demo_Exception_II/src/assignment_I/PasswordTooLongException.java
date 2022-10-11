package assignment_I;

public class PasswordTooLongException extends Exception{

	private String msg;
	
	public PasswordTooLongException() {
		msg = "Password should be less than 12 character";
	}
	
	public String getMessage()
	{
		return msg;
	}
}
