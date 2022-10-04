class Box
{
	private int height, width, depth;
	
	public void calVol()
	{
		int volume = height*width*depth;
		System.out.println("Volume: "+volume);
	}
	public void setHeight( int h)
	{
		height = h;
	}
	public int getHeight()
	{
		return height;
	}
	public void setWidth( int w)
	{
		width = w;
	}
	public int getWidth()
	{
		return width;
	}
	public void setDepth( int d)
	{
		depth = d;
	}
	public int getDepth()
	{
		return depth;
	}		
	public void setData( int h, int w, int d)
	{
		height = h;
		width = w;
		depth = d;
	}
	public void showData()
	{
		System.out.println("Height: "+height+", Width: "+width+", Depth: "+depth);
	}
}

class DemoBox
{
	public static void main(String args[])
	{
		Box b1 = new Box();

		
		Box b2 = new Box();
		b1.calVol();
		b2.calVol();

		b1.setData(10, 20, 30);
		b1.calVol();
		int a = b1.getWidth();
		System.out.println("Width of b1 is:"+a);
		b2.setData(20,30,40);
		b2.showData();
		b2.setDepth(50);
		b2.showData();
		b2.calVol();
	}
}		