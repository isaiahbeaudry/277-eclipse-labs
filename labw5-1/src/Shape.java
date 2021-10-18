/**
 *
 * @author Susan Nachawati
 *
 */
public abstract class Shape {
	private double xPos;
	private double yPos;

	/**
	 * Default constructor
	 */
	Shape() {
		xPos = 0;
		yPos = 0;
	}

	/**
	 * Overloaded constructor
	 * 
	 * @param x
	 * @param y
	 */
	Shape(double x, double y) {
		xPos = x;
		yPos = y;
	}

	/**
	 *
	 * @return
	 */
	public final double getxPos() {
//final: cannot override the method in the derived class
		return xPos;
	}

	public final double getyPos() {
		return yPos;
	}

	public void moveTo(double x, double y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "x = " + xPos + " y= " + yPos;
	}

	/**
	 * This is an abstract method
	 * 
	 * @return
	 */
	public abstract double computeArea();
}// end class Shape