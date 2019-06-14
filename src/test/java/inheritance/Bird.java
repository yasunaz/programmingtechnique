package inheritance;
// PARENT CLASS

public class Bird {
	// Fields
	public int age;
	public String name; 
	
	// Constructors
	public Bird(int a, String n) {
		age = a;
		name = n;
	}
	
	// Methods 
	public void flyUp() {
		System.out.println("Flying up....");
	}
	
	public void flyDown() {
		System.out.println("Flying down.....");
	}
}
