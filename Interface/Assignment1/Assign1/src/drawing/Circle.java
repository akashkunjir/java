package drawing;

public class Circle implements Drawable {

	double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void drawShape() {
		System.out.println("Circle");

	}

	@Override
	public void calculateArea() {
		System.out.println("Area: " + (pi * radius * radius));
	}

}
