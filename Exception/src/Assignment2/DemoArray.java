package Assignment2;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		try {
			int size;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your size: ");
			size = sc.nextInt();
			int a[] = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.print("Enter " + i + " element: ");
				a[i] = sc.nextInt();
			}
			System.out.print("Enter index for array: ");
			int in = sc.nextInt();
			System.out.print("Your Element: " + a[in]);
		} catch (NumberFormatException e) {
			System.out.println("Check Number Format --- " + e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check Your Index Again --- " + e.getMessage());
			e.printStackTrace();
		} catch (NegativeArraySizeException e) {
			System.out.println("Negative Array Size Not Possible --- " + e.getMessage());
			e.printStackTrace();
		}
	}

}
