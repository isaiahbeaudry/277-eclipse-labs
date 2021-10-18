public class Ship implements Comparable<Ship> {
	String name;
	int year;

	// Default constructor
	public Ship() {
		name = "noname";
		year = 1000;
	}
	
	// Overloaded constructor for name and year
	public Ship(String iname, int iyear) {
		this.name = iname;
		this.year = iyear;
	}

	// get methods
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	// Override toString method
	public String toString() {
		return "The name of the ship is " + name + ". It was built in " + year + ".";
	}
	
	/**
	 * Compares two Ship items
	 * 
	 * @param other
	 */
	public int compareTo(Ship other) {
		if (getYear() < other.getYear()) {
			return -1;
		} else if (getYear() > other.getYear()) {
			return 1;
		} else
			return 0;
	}
}