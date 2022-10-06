package Assign8;

public class Customer {
	String email;
	Address add;
	public Customer() {
		super();
		email = "xyz@example.com";
	}
	public Customer(String email, Address add) {
		super();
		this.email = email;
		this.add = add;
	} 
	
	public Customer(String email, String a, String c, String pin)
	{
		this.email = email;
		add = new Address(a, c, pin);
		
	}
	
	public void displayCustInfo()
	{
		System.out.println("----------------------------------");
		System.out.println("Customer Info:\nEmail: "+email+add.displayAddress());
	}
}
