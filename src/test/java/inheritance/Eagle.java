package inheritance;

// CHILD CLASS 
public class Eagle extends Bird {
	// Fields 
	public String mood;
	
	// Constructor
	public Eagle(int a, String n, String m) {
		super(a, n);
		mood = m;
	}
	
	
	// Methods 
	public void flyUp() {
		System.out.println("zooooooom");
	}
	
	@Override
	public void flyDown() {
		System.out.println("Wuuuuush!");
	}

}
