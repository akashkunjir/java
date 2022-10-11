package assignment1;

public class DemoEmp {

	public static void main(String[] args) {
		Emp e[] = new Emp[4];
		e[0] = new SalesManager("101", 1000, "akg", "pune", 28, 50, 200);
		e[1] = new Programmer("102", 1000, "yhg", "pakistan", 21, 2, 5000);
		e[2] = new Admin("103", 500, "shakti", "ayodhya", 48, 900);
		e[3] = new Programmer("104", 1000, "sandeep", "mirzapur", 22, 5, 8000);
		for (int i = 0; i<e.length; i++) {
			System.out.println(e[i].toString());
			if (e[i] instanceof SalesManager)
				if(((SalesManager)e[i]).travelling())
					System.out.println("Manager is Travelling");
		}
	}
}
