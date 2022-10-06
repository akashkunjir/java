package assig2;

public class Book {
private static int bookid;
private float price;
public Book()
{
bookid++;
price=10f;
}
public Book(float p)
{
	bookid++;
	price=p;
}
public void display()
{
	System.out.println("__________");
	System.out.println("book id:"+bookid);
	System.out.println("book price:"+price);
	
}

}
