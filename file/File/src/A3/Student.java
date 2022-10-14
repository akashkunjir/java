package A3;

public class Student {
	
private int rno;
private String name;
private double marks;
public Student() {
	super();
}
public Student(int rno, String name, double marks) {
	super();
	this.rno = rno;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
}

}
