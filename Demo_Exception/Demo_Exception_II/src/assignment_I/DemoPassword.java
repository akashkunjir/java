package assignment_I;

import java.util.Scanner;

public class DemoPassword {

	public static void main(String[] args) {

		try {
			System.out.print("Enter Your Password: ");
			Scanner sc = new Scanner(System.in);

			String pwd = sc.next();

			if (pwd.length() > 12) {
				throw new PasswordTooLongException();
			}

			if (pwd.length() < 8) {
				throw new PasswordTooShortException();
			}
			
			else {
				System.out.println("Password is Correct Length!");
			}
		}

		catch (PasswordTooLongException | PasswordTooShortException e) {
			System.out.println(e.getMessage());
		}

	}
}
