package A_1;

public class Student {

	private int studentid;
	private String name;
	private String city;
	private double percentage;

	public Student() {
		super();
	}

	public Student(int studentid, String name, String city, double percentage) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage
				+ "]";
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public boolean equals(Object obj) {

		Student temp = (Student) obj;
		boolean flag = false;
		if(this.studentid!=temp.studentid)
			flag = false;
		else if (this.city == temp.city)
			flag = true;
		return flag;
	}

	public int hashCode() {

		return city.hashCode();
	}
}
