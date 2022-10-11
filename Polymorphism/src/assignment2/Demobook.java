package assignment2;

import java.util.Scanner;

public class Demobook {

	public static void main(String[] args) {
		
		Book b[] = new Book[5];
		b[0] = new Ebook(750, 5);
		b[1] = new Paperbook(750, 5);
		b[2] = new Ebook(2000, 5);
		b[3] = new Paperbook(3000, 5);
		b[4] = new Ebook(250, 5);
		
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i].toString());
		}
			
	}
}
