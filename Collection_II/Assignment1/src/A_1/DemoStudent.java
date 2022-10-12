package A_1;

import java.util.*;

public class DemoStudent {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Reeta", "Pune", 90);
		Student s2 = new Student(102, "Geeta", "Mumbai", 89);
		Student s3 = new Student(103, "Seeta", "Pune", 88);
		Student s4 = new Student(104, "Meeta", "Mumbai", 87);
		Student s5 = new Student(105, "Zeeta", "Pune", 86);

		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		for (Student emp : students)
			System.out.println(emp);

	}
}
