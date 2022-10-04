class Point
{
	private int x, y; 
	public Point() //No Argument Constructor
	{ x=y=5;}
	public Point(int x, int y) //parameterised constr
	{
		this.x=x;
		this.y=y;
	}
	public void showPoint()
	{
		System.out.println("Point: ["+x+","+y+"]");
	}
}

public class DemoPoint
{
	public static void main(String a[])
	{
	Point p1 = new Point();// call for no argument constr
	p1.showPoint();
	
	Point p2 = new Point(10,20);// call for parameterised constr
	p2.showPoint();
	}
}	