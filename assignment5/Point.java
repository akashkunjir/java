package assignment5;

public class Point {
	private int x, y;

	public Point() {
		x = 1;
		y = 1;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void ShowPoint() {
		System.out.println("[" + x + "," + y + "]");
	}

	public Point(Point obj) {
		this.x = obj.x;
		this.y = obj.y;
	}
	
	public String toString()
	{
		return "[" + x + "," + y + "]";
	}

}
