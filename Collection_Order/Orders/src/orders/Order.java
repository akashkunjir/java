package orders;

public class Order {

	private String prod_name;
	private double price;
	private int prod_id;

	public Order(String prod_name, double price, int prod_id) {
		super();
		this.prod_name = prod_name;
		this.price = price;
		this.prod_id = prod_id;
	}

	@Override
	public String toString() {
		return "Order [prod_name=" + prod_name + ", price=" + price + ", prod_id=" + prod_id + "]";
	}

	public Order() {
		super();
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

}
