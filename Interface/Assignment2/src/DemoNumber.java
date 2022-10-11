import java.util.Scanner;

public class DemoNumber {

	public static void main(String[] args) {
		MyNum no1 = new MyNum();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();

		if (no1.isOdd(num)) {
			System.out.println("Number is Odd");
		} else {
			System.out.println("Number is not Odd");
		}

		if (no1.isEven(num)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is not Even");
		}

		if (no1.isPrime(num)) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}

		System.out.println("Factorial of number: " + no1.calFact(num));
		sc.close();
	}
}
