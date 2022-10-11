package assignment1;

public class Admin extends Emp {
	private double bonus;

	public Admin() {
		super();
	}

	public Admin(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Admin(String empid, double salary, String name, String add, int a, double bonus) {
		super(empid, salary, name, add, a);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Admin [" + super.toString() + "bonus=" + bonus + ", person=" + person + "]";
	}

	public double calSalary() {
		return salary + bonus;
	}
}
