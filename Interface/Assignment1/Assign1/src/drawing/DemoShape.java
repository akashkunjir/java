package drawing;

public class DemoShape {
	public static void main(String[] args) {
		Circle c1=new Circle(3);
		c1.drawShape();
		c1.calculateArea();
		
		Rectangle r1 = new Rectangle(2,2);
		r1.drawShape();
		r1.calculateArea();
		
		Triangle t1 = new Triangle(10,10);
		t1.drawShape();
		t1.calculateArea();
		
	}
	
	

}
