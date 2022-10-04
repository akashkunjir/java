class Point
{
	private int x,y;
	public Point()
	{x=1;
	y=1;
	}
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void ShowPoint()
	{System.out.println("["+x+","+y+"]");}
	public Point (Point obj)
	{this.x=obj.x;
	this.y=obj.y;
	}
}

public class DemoPoint {

	public static void main(String[] args) {
		Point p1=new Point();
		p1.ShowPoint();
		Point p2=new Point(12,50);
		p2.ShowPoint();
		Point p3=new Point(p2);
		p3.ShowPoint();
		
		
		// TODO Auto-generated method stub

	}

}
