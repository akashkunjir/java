package assignment1;

public class Emp extends Person {
	protected String empid;
	protected double salary;
	Person person;

	public Emp() {
		super();
	}

	public Emp(String empid, double salary, String name, String add, int a) {
		super(name, add, a);
		this.empid = empid;
		this.salary = salary;
	}
	public double calSalary()
	{
		return salary;
	}


	public String toString() {
		return " employee id :" + empid + " employee sal:" + salary + super.toString();
	}
}
