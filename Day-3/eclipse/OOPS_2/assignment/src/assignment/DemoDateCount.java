package assignment;
class DateCount
{
	private int day,month,year;
	private static int count;//static member count
	public DateCount()
	{
		count++;//incremented count inside constru
		day=1;
		month=1;
		year=2022;
	}
	public DateCount(int day,int month,int year)
	{
		count++;//incremented count inside constru
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public static void showCount()//static method
	{
		System.out.println(count);
	}
	
}
public class DemoDateCount {

	public static void main(String[] args) {
	DateCount.showCount();
	DateCount d1 = new DateCount();
	DateCount d2 = new DateCount(1,1,2023);
	DateCount d3 = new DateCount(13,1,1990);
	DateCount d4 = new DateCount();
	DateCount d5 = new DateCount(25,12,2021);
	d5.showCount();

	}

}
