public class CargoShip extends Ship {
	int numOfTons;

	// Default constructor
	public CargoShip() {
		super();
		this.numOfTons = 0;
	}
	
	// Overloaded constructor
	public CargoShip(String iname, int iyear, int inumOfTons) {
		super(iname, iyear);
		this.numOfTons = inumOfTons;
	}

	// get method
	public int getNumOfTons() {
		return numOfTons;
	}
	
	// set method
	public void setNumOfTons(int inum) {
		this.numOfTons = inum;
	}

	// Override toString
	public String toString() {
		return super.toString() + " The ship cargo capacity is " + numOfTons + ".";
	}
}