package inheritance.quiz;

public class CargoFlight extends Flight {
	// Fields
	private int seats = 2;
	int dueTime = 14;

	@Override
	public void addOnePassenger() {
		if (passenger < seats) {
			passenger++;
		} else {
			System.out.println("Cargo is full");
		}
	}

	@Override
	public int getSeats() {
		return seats;
	}

	@Override
	public void showFlightDetail() {
		System.out.println("Child Flight");
	}
	
	public void generalInfo() {
		this.showFlightDetail();  // itself
		super.showFlightDetail(); // parent
	}
}
