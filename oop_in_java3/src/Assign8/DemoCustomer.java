package Assign8;

public class DemoCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("abc@gmail.com","Deccan", "Pune", "411004");
		c1.displayCustInfo();
		Customer c2 = new Customer("abcasd@gmail.com","FC", "Pune", "411002");
		c2.displayCustInfo();
	}
}
