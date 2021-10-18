package foursidesPack;

public class Square {

	private String color;
	protected String type;
	public String name;
	String make;
	private Shape2D s1 = new Shape2D();
	
	
	/**
	 * default constructor
	 */
	public Square() {
		this.color = "";
		this.type = "";
		this.name = "";
		this.make = "";
		System.out.println(s1.name);
	}
	
	/**
	 * @param color
	 * @param type
	 * @param name
	 * @param make
	 */
	public Square(String color, String type, String name, String make) {
		this.color = color;
		this.type = type;
		this.name = name;
		this.make = make;
		System.out.println(s1.name);
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "I am a Square: " + color + type + name + make;
	}
}