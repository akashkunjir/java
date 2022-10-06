package assign7;

public class DemoPerson {
public static void main(String[] args) {
	Date d1 = new Date(11,07,1998);
	Person p1 = new Person("Seeta", d1);
	Person p2 = new Person("Geeta", 15, 2, 2021);
	p1.displayInfo();
	p2.displayInfo();
}
}
