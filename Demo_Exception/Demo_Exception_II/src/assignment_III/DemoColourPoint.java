package assignment_III;

public class DemoColourPoint {

	public static void main(String[] args) {
		try {
			ColorPoint cp2 = new ColorPoint(10, 20, "Green");
			System.out.println("Point p2: " + cp2.toString());
		} catch (InvalidColourException e) {
			System.out.println(e.getMessage());
		}
	}
}
