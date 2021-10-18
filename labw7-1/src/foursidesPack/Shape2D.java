package foursidesPack;

public class Shape2D {

	public String name;
	
	/**
	 * default constructor
	 */
	public Shape2D() {
		this.name = "Shape2D";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "I am a: " + name;
	}
}
