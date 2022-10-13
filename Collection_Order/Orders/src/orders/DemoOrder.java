package orders;

import java.util.*;

public class DemoOrder {

	public static void main(String[] args) {

		List<Order> order = new LinkedList<>();

		int choice = 1;

		do {
			System.out.println("Enter your option: ");
			System.out.println("1. Accept Product Details name, price, id");
			System.out.println("2. Display with Name Sort");
			System.out.println("3. Display with Price Sort");
			System.out.println("4. Display with Id Sort");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name:");
				String n1 = sc.next();
				System.out.println("Enter price");
				double p1 = sc.nextDouble();
				System.out.println("Enter id");
				int i1 = sc.nextInt();
				order.add(new Order(n1, p1, i1));
				System.out.println("Entery Added!");
				break;
			case 2:
				Collections.sort(order, new CompareName());
				System.out.println("====Name Sorted List ====");
				for (Order o : order)
					System.out.println(o);
				break;
			case 3:
				Collections.sort(order, new ComparePrice());
				System.out.println("====Price Sorted List ====");
				for (Order o : order)
					System.out.println(o);
				break;
			case 4:
				Collections.sort(order, new CompareId());
				System.out.println("====ID Sorted List ====");
				for (Order o : order)
					System.out.println(o);
				break;
			default:
				System.out.println("Thank You");
				break;

			}
		} while (choice != 0);
	}
}
