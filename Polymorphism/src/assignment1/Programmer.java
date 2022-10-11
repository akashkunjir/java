package assignment1;

public class Programmer extends Emp {
	private double exhrs, rate;

	public Programmer() {
		super();
	}

	public Programmer(double exhrs, double rate) {
		super();
		this.exhrs = exhrs;
		this.rate = rate;
	}

	public Programmer(String empid, double salary, String name, String add, int a, double exhrs, double rate) {
		super(empid, salary, name, add, a);
		this.exhrs = exhrs;
		this.rate = rate;
	}

	public double calSalary() {
		return salary + exhrs * rate;
	}

	@Override
	public String toString() {
		return "Programmer [" + super.toString() + "exhrs=" + exhrs + ", rate=" + rate + ", person=" + person + "]";
	}

}
