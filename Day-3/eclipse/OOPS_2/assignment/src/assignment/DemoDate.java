package assignment;

class Date{
	private int day,month,year;
	public Date()
	{
		day=month=1;
		year=2022;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date (Date obj)
	{
		this.day=obj.day;
		this.month=obj.month;
		this.year=obj.year;
	}
	public void  showDate()
	{
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
	public void setMonth(int a)
	{
		month=a;
	}
	public void showDate(char c)
	{
		System.out.println("Date:"+day+c+month+c+year);
	}
}
public class DemoDate {

	public static void main(String[] args) {
		Date d1=new Date();
		d1.showDate();
		Date d2=new Date(18,04,2022);
		d2.showDate();
		Date d3=new Date(d2);
		d2.showDate();
		d2.setMonth(5);
		d2.showDate();
		Date d4=d2;//only reference copied/shallow copy
		d4.setMonth(3);
		d2.showDate();
		d4.showDate('-');
		
	}

}
