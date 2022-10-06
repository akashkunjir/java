package assign6;

public class Box {

private int height, width, depth;

	public Box(int height, int width, int depth) {
	super();
	this.height = height;
	this.width = width;
	this.depth = depth;
}
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
