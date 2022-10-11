package assignment1;

public class SalesManager extends Emp{
	private double target;
	private double incentive;
	private boolean travelling=true;
	public SalesManager() {
		super();
	}
	public SalesManager(String empid, double salary, String name, String add, int a, double target, 
			double incentive) {
		super(empid, salary, name, add, a);
		this.target = target;
		this.incentive = incentive;
	}
	public double calSalary()
	{
		return (salary+target*incentive);
	}
	@Override
	public String toString() {
		return "SalesManager ["+ super.toString() +"target=" + target + ","
				+ " incentive=" + incentive + ", person=" + person + "]";
	}
	
	public boolean travelling()
	{
		return travelling;
	}
	
	

}
