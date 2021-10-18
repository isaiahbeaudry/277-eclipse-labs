package foursidesPack;

public class Rectangle extends Square {

	/**
	 * default constructor
	 */
	public Rectangle() {
		super();
	}
	
	/**
	 * @param color
	 * @param type
	 * @param name
	 * @param make
	 */
	public Rectangle(String color, String type, String name, String make) {
		super(color, type, name, make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "I am a Rectangle: " + getColor() + type + name + make;
	}

}
