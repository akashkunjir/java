package assign3;

public class DemoDate {
public static void main(String[] args) {
	Date d1 = new Date();
	d1.displayDate();
	
	Date d2 = new Date(4,4,2004);
	d2.displayDate();
	
	Date d3 = new Date();
	d3.setDate(2, 2);
	d3.displayDate();
	
	Date d4 = new Date();
	d4.setDay(2);
	d4.displayDate();
	
}
}
