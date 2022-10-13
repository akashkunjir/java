package orders;

import java.util.Comparator;

public class CompareId implements Comparator<Order> {
	public int compare(Order o1, Order o2) {
		return o1.getProd_id() - o2.getProd_id();
	}
}
