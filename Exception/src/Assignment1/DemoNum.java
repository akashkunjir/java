package Assignment1;

public class DemoNum {

	public static void main(String a[]) {
		try {
			int num1 = Integer.parseInt(a[0]);
			int num2 = Integer.parseInt(a[1]);
			int div;
			div = (num1 / num2);

			System.out.println("Result: " + div);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be zero --- " + e.getMessage());
			e.printStackTrace();
	
		} catch (NumberFormatException e) {
			System.out.println("Check number format --- " + e.getMessage());
			e.printStackTrace();
		}

	}
}
