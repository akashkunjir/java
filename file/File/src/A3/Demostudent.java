package A3;

import java.util.Scanner;

public class Demostudent {

	public static void main(String[] args) {
		Student s1=new Student();
		Scanner sc= new Scanner (System.in);
		System.out.println("enter student rno, name , marks");
		int rno =sc.nextInt();
		String name =sc.next();
		double marks=sc.nextDouble();
		s1=new Student(rno,name,marks);
		System.out.println(s1);
		
		// TODO Auto-generated method stub

	}

}
