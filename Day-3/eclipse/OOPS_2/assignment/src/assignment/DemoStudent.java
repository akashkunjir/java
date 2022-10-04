package assignment;
class Student
{
private int rno;
private String name;
private double avg;
private static int count;
public Student()
{ 	
	count++;
	rno=count;
	name=null;
	avg=90;
	
}
public Student(String c,int a)
{
	count++;
	name=c;
	avg=a;
	rno=count;
}
public Student (String c)
{	
	count++;
	name=c;
	avg=90;
	rno=count;
}
public void display()
{
	System.out.println("---------------------");
	System.out.println("roll no:"+rno);
	System.out.println("avarage:"+avg);
	System.out.println("name:"+name);
}


}
public class DemoStudent {

	public static void main(String[] args) {
		Student s1=new Student("seeta");
		Student s2=new Student("geeta",69);
		Student s3=new Student();
		Student s4=new Student("nitin");
		Student s5=new Student("Ram");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		// TODO Auto-generated method stub

	}

}
