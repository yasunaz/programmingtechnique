package interfaces;

public class Cat implements Runnable, Restable {
	// Fields
	private String givenName;
	private Integer age;
	
	// Constructor
	public Cat(String n, Integer a) {
		givenName = n;
		age = a;
	}
	
	// Methods
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void run() {
		System.out.println("Cat is running");
	}

	public void sleep() {
		System.out.println("Cat is sleeping");
	}
}
