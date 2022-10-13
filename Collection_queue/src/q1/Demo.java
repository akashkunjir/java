package q1;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<>();
		que.add("Pune");
		que.add("Nagpur");
		que.add("Delhi");
		que.add("Nashik");
		que.add("Mumbai");
		System.out.println(que);
		String no=que.remove();
		System.out.println(" City Is "+no);
		String n1=que.remove();
		System.out.println(" City Is "+n1);
		String n2=que.remove();
		System.out.println(" City Is "+n2);
		String n3=que.remove();
		System.out.println(" City Is "+n3);
		String n4=que.remove();
		System.out.println(" City Is "+n4);

	}

}
