class Box
{
	private int height,width,depth;
	public Box()
	{
		height=1;
		width=1;
		depth=1;
	}
	public Box(int height,int width,int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public Box( Box obj)
	{this.height=obj.height;
	this.width=obj.width;
	this.depth=obj.depth;
	}
	public void CalVolume()
	{
		int volume=height*width*depth;
		System.out.println("volume:"+volume);
	}
	
}
public class DemoBox {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.CalVolume();
		Box b2=new Box(20,16,7);
		b2.CalVolume();
		Box b3=new Box(b2);
		b3.CalVolume();
		// TODO Auto-generated method stub

	}

}
