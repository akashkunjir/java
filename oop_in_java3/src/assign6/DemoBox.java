package assign6;

public class DemoBox {
	public static void main(String[] args) {
		
		Box b[] = new Box[3];
		
		b[0] = new Box(10,20,30);
		b[1] = new Box(2,3,5);
		b[2] = new Box(7,8,9);
		for(int i=0;i<3;i++)
		{

			b[i].showData();
			b[i].calVol();
		}
	}
}
