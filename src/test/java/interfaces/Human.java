package interfaces;

public class Human implements Runnable {
	// Fields
	private String gender;
	private String name;
	private Integer age;
	
	// Constructors
	public Human(String g, String n, Integer a) {
		gender = g;
		name = n;
		age = a;
	}
	
	// Methods 
	public void walk() {
		System.out.println("Human" + name +" is walking");
	}

	public void run() {
		System.out.println("Human is running");
	}

	public void sleep() {
		// TODO Auto-generated method stub
	}
	
	
}
