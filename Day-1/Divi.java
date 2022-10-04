public class Divi
{
	public static void main(String args[])
	{
		int num= 24;
		System.out.print("Diviser of "+num +" are ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
                             if(num==i)
				System.out.print(i);
			    else
				System.out.print(i+",");
			}
		}
	}
}
