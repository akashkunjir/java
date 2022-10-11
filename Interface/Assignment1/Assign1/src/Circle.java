import java.util.Scanner;

public class Circle implements Drawable{

	
	public void drawShape() {
		System.out.println("====Drawing Circle===");
		
	}

	public void calculateArea() {

		System.out.println("Enter Radius for Circle: ");
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double a = pi*r*r;

		System.out.println("Area of Circle is: "+a);
		
	}


	
}
