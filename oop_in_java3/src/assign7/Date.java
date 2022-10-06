package assign7;

public class Date {
	private int day,month, year;

	public Date() {
		super();
		day=month=1;
		year=2022;
		
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
		public String displayDate()
		{
			return "date:"+day+"/"+month+"/"+year;
		}
	}
