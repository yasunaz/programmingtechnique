package javaoopreveiw;

public class Flight {
	// Fields 
		private Integer passengers; // how many ppl on board ?
		private Integer seats;      // max limit of ppl can be on board
	
	// Constructor
		private Flight(int s) {
			seats = s;
		}
		
		public Flight() {
			this(100);
			this.passengers = 0;
		}
	
	// Methods 
	public void addOnePassenger() {
		if(passengers <= seats) {
			passengers++;
		}
	}
	
	public Integer getSeats(int code) {
		if(code == 123) {
			return seats;
		}
		return null;
	}
	
	public void setSetas(int newSeatValue, int code) {
		if(code == 123) {
			seats = newSeatValue;
		}
	}
	// Access 
	public Integer getPassenger() {
		return this.passengers;
	}
	
	//Mutator
	public void setPassenger(int newValue) {
		if(newValue > 150)
			this.passengers = 150;
		else
			this.passengers = newValue;
	}
	
}
