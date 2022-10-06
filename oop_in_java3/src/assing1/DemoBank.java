package assing1;

public class DemoBank {
public static void main(String[] args) {
	BankAccount b1=new BankAccount();
	BankAccount b2=new BankAccount(1002,5000);
	b1.display();
	b2.display();
	b2.updateIntrate(10);
	b2.display();
}
}
