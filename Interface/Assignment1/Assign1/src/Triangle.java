import java.util.Scanner;

public class Triangle implements Drawable {

	public void drawShape() {
		System.out.println("====Drawing Triangle===");
		
	}

	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height for Triangle: ");
		double h = sc.nextDouble();
		System.out.println("Enter Base for Triangle: ");	
		double b = sc.nextDouble();	
		double a = 0.5*b*h;
		System.out.println("Area of Circle is: "+a);
		
	}
}
