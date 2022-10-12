package A_2;

import java.util.*;

public class DemoEmp {
	public static void main(String[] args) {

		Set<Emp> emps = new TreeSet<Emp>();
		emps.add(new Emp(10, "Seeta", 6000));
		emps.add(new Emp(5, "Geeta", 7800));
		emps.add(new Emp(23, "Neeta", 700));
		emps.add(new Emp(4, "Meeta", 6600));
		emps.add(new Emp(21, "Suneeta", 3400));
		emps.add(new Emp(56, "Aneeta", 4000));

		for (Emp emp : emps)
			System.out.println(emp);

	}

}
