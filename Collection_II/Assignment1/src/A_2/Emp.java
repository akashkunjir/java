package A_2;


public class Emp implements Comparable<Emp>{
	private int eid;
	private String name;
	private double Salary;

	public Emp(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		Salary = salary;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", Salary=" + Salary + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}


	public int compareTo(Emp o) {

		return ((int) (this.Salary - o.Salary));
	}
}
