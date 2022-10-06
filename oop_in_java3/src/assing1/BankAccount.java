package assing1;

public class BankAccount {
private int accno;
private int balance;
private static float int_rate;
static {
	int_rate=7f;
}
public BankAccount()
{
	accno=10;
	balance=50;
}
public BankAccount(int accno,int balance)
{
	this.accno=accno;
	this.balance=balance;
}
public static void updateIntrate(float r)
{int_rate=r;
}
public void calculateBalance()
{
	System.out.println("balance:"+(balance+balance*int_rate/100));
}

public void display()
{
	System.out.println("____________");
	System.out.println("acoount number:"+accno);
	System.out.println("interest rate:"+int_rate);
	calculateBalance();
}
}