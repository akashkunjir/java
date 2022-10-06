package assign7;

public class Person {

	private String name;
	private Date dob;
	
	public Person() {
		super();
		name = null;
		dob = null;
	}

	public Person(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	
	public Person(String nm, int d, int m, int y)
	{
		name = nm;
		dob = new Date(d, m, y);
	}
	public void displayInfo()
	{
		System.out.println("Person: "+name+" DOB: "+dob.displayDate());
	}
}
