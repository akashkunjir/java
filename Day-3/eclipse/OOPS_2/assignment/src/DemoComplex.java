class Complex
{
	private int real ,imaginary;
	public Complex ()
	{
		real=3;
		imaginary=5;
	}
	public Complex(int r, int i)//paramteric constr
	{
		real = r;
		imaginary = i;
		}
	public void ShowComplex()
	{
		if(imaginary>0)
		{
			System.out.println(real+"x"+"+"+imaginary+"i");
			
		}
		else
		{
			System.out.println(real+"x"+imaginary+"i");
		}
	}
}
public class DemoComplex {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
				c1.ShowComplex();
		Complex c2 = new Complex(2,-4);
				c2.ShowComplex();
		
		// TODO Auto-generated method stub

	}

}
