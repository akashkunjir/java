package A2;

import java.io.*;

public class DemoQuitString {
	public static void main(String[] args) {

		try {

			String c;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter characters, 'quit' will quit program.");
			// read characters
			do {
				c = buffer.readLine();
				System.out.print(c);
			} while ((!c.equals("quit")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
