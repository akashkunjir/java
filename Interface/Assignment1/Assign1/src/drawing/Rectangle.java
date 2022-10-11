package drawing;

public class Rectangle implements Drawable {

	double l, b;

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public void drawShape() {
		System.out.println("Rectangle");

	}

	@Override
	public void calculateArea() {
		System.out.println("Area: " + (l * b));

	}

}
