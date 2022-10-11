package assignment2;

public class Book {

	protected static int bookid;
	protected float price;

	public Book() {
		bookid++;
		price = 10f;
	}

	public Book(float p) {
		bookid++;
		price = p;
	}

	@Override
	public String toString() {
		return "Book ["+bookid+ "price=" + price+"]";
	}
	
	public double calCost() {
		return price;
	}

}