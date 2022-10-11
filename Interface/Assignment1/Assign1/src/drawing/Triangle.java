package drawing;

public class Triangle implements Drawable {
	double h,b;

	public Triangle(double h, double b) {
		super();
		this.h = h;
		this.b = b;
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape() {
		System.out.println("Triangle");
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateArea() {
		System.out.println("Area: "+(b*h*0.5));
		// TODO Auto-generated method stub

	}

}
