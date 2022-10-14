package A1;

import java.io.*;
import java.util.Scanner;

public class DemoQuit {
	public static void main(String[] args) {

		try {

			char c;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter characters, 'q' to quit.");
			// read characters

			while ((c = (char) br.read()) != 'q') {
				System.out.print(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
