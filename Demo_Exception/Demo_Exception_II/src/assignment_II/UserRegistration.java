package assignment_II;

import java.util.Scanner;

public class UserRegistration {

	private String userName;
	private String userCountry;
	private int userAge;
	public UserRegistration(String userName, String userCountry, int userAge) {
		super();
		this.userName = userName;
		this.userCountry = userCountry;
		this.userAge = userAge;
	}
	public UserRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "UserRegistration [userName=" + userName + ", userCountry=" + userCountry + ", userAge=" + userAge + "]";
	}
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your details: ");
			String n, c;
			int a;
			System.out.print("Enter name: ");
			n = sc.next();
			System.out.print("Enter country: ");
			c = sc.next();
			System.out.print("Enter age: ");
			a = sc.nextInt();

			if (!c.equals("India")) {
				throw new InvalidCountryException();
			} else {
				UserRegistration u1 = new UserRegistration(n, c, a);
				System.out.println("User Registration Succesful! " + u1);
			}
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
