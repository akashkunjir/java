package assignment1;

public class Person {
	private String name,address ;
	private int age ;
	public Person() {
		super();
	}
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	

}
