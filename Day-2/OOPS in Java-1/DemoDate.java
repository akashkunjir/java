class Date
{
	private int day,month,year;
	public void setDate(int d, int m ,int y)
		{ day = d;
		month= m;
		year = y;
		}
	public void showDate()
		{ System.out.println("date:"+day+"/"+month+"/"+year);
		}
	public void setDay(int d)
	{day = d;}
	public void setMonth(int m)
	{month = m;}
	public void setYear(int y)
	{year = y;}
}
public class DemoDate
{ public static void main(String args[])
	{Date d1 =new Date();
	d1.showDate();
	d1.setDate(1,1,1995);
	d1.showDate();
	d1.setDay(4);
	d1.setMonth(2);
	d1.showDate();
	}
}