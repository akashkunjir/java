package orders;

import java.util.Comparator;

public class CompareName implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		return o1.getProd_name().compareTo(o2.getProd_name());
	}

}
