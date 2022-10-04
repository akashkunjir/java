class Calculator
{
	private int num1,num2;
	public void setNum(int n1,int n2)
	{ 
		num1=n1;
		num2=n2;
	}
	public void showAddition()
		{System.out.println("addition:"+(num1+num2));}
	public void showSubtraction()
		{System.out.println("subtraction:"+(num1-num2));}
	public void showMultiplication()
		{System.out.println("multiplication:"+(num1*num2));}
	public void showDivision()
		{System.out.println("division:"+(num1/num2));}
}
public class DemoCalculator
{
	public static void main(String args[])
	{
		Calculator C1=new Calculator();
		C1.setNum(10,2);
		C1.showMultiplication();
		C1.showDivision();
		C1.showAddition();
		C1.showSubtraction();
	}
}