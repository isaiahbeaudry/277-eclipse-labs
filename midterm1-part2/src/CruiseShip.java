public class CruiseShip extends Ship {
	int maxPassengers;

	// Default constructor
	public CruiseShip() {
		super();
		this.maxPassengers = 0;
	}
	
	// Overloaded constructor
	public CruiseShip(String iship, int iyear, int ipassengers) {
		super(iship, iyear);
		this.maxPassengers = ipassengers;
	}

	// get method
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	// set method
	public void setMaxPassengers(int inum) {
		this.maxPassengers = inum;
	}

	// Override toString method
	public String toString() {
		return super.toString() + " The maximum number of passengers is " + maxPassengers + ".";
	}
}