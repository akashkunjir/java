package assign3;

public class Date {

	private int day, month, year;
	private static int count;
	public Date(int day, int month, int year) {
		super();
		count++;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		super();
		day=month=1;
		year=2022;
		count++;
	}
	public void setDate(int d, int m)
	{
		day =d;
		month = m;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	public void setMonth(int m)
	{
		month = m;
	}
	public void displayDate()
	{
		
		System.out.println("Date: "+day+"/"+month+"/"+year);
		System.out.println("Count: "+count);
	}
	
}
