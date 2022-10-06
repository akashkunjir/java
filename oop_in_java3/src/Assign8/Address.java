package Assign8;

public class Address {
	String area, city, pincode;

	public Address() {
		super();
		area = null;
		city = null; 
		pincode = null;
	}

	public Address(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String displayAddress()
	{
		return "\nAddress: "+area+" "+city+" "+pincode;
	}
	
}
