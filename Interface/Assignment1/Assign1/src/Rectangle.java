import java.util.Scanner;

public class Rectangle implements Drawable{


	public void drawShape() {
		System.out.println("====Drawing Rectangle===");
		
	}

	public void calculateArea() {

		System.out.println("Enter Length for Rectangle: ");
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		System.out.println("Enter Breadth for Rectangle: ");
		double b = sc.nextDouble();
		double a = l*b;
		System.out.println("Area of Rectangle is: "+a);
		
	}


}
