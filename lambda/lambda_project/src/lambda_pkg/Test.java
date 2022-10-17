package lambda_pkg;

public class Test {

	public static void main(String[] args) {
		Test_Interface t1 = () -> {
			System.out.println("New in Test");
		};
		t1.test();

		Test1 eveno = (int n) -> {
			if (n % 2 == 0)
				System.out.println("no is even");
			else
				System.out.println("no is odd");
		};

		eveno.check(7);

		Test3 max = (int a, int b) -> {
			if (a > b)
				System.out.println("A is greater");
			else
				System.out.println("B is greater");
		};
		max.check(8, 4);
	}
}
