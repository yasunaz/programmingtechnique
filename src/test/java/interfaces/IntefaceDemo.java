package interfaces;

public class IntefaceDemo {

	public static void main(String[] args) {
		// Client side coding 
		 Runnable runner = new Human("M", "Nijat", 28); 
		 runner.run();
		 
		 Restable sleepyhead = new Cat("Tom", 4);
		 sleepyhead.sleep();
		 
	}
	
	public static void dispalyRunning(Runnable runner) {
		runner.run();
	
	}

}
