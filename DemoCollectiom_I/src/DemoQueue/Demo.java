package DemoQueue;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
	Queue<Integer> que=new PriorityQueue<>();
		que.add(65);
		que.add(345);
		que.add(43);
		que.add(232);
		que.add(42);
		que.add(21);
		que.add(97);
		System.out.println(que);
		int no=que.remove();
		System.out.println(" Number Is "+no);
		int n1=que.remove();
		System.out.println(" Number Is "+n1);
		int n2=que.remove();
		System.out.println(" Number Is "+n2);
		int n3=que.remove();
		System.out.println(" Number Is "+n3);
		int n4=que.remove();
		System.out.println(" Number Is "+n4);
		int n5=que.remove();
		System.out.println(" Number Is "+n5);
		int n6=que.remove();
		System.out.println(" Number Is "+n6);
		
		
	}

}
