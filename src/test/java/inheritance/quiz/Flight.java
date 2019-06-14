package inheritance.quiz;

public class Flight {
	// Fields
	int passenger = 0;
	int seats = 150;
	int flighttime = 12;
	
	// Constructors
	public Flight() {
		
	}
	
	// Methods 
	public void addOnePassenger() {
		if( hasSeating() == true) 
			passenger++;
		else 
			handleTooMany();
	}
	
	public int getSeats() {
		return seats;
	}
	
	private boolean hasSeating() {
		return  passenger < seats;
	}
	
	private void handleTooMany() {
		System.out.println("No more seating is premitted");
	}
	
	public void showFlightDetail() {
		System.out.println("Parent Flight");
	}
}
