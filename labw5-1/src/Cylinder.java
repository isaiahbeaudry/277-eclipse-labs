/**
 *
 * @author Isaiah Beaudry
 *
 */
public class Cylinder extends Circle {
	private double radius;
	private double height;

	/**
	 * Default Constructor
	 */
	Cylinder() {
		super(); // call Circle
		height = 0;
	}

	/**
	 * Overloaded constructor
	 * @param x
	 * @param y
	 * @param r
	 */
	public Cylinder(double x, double y, double r, double h) {
		super(x, y, r); // call Circle(x,y, r)
		height = h;
	}

	/**
	 * Function to compute area
	 */
	public double computeArea() {
		return (super.computeArea() * 2) + (2 * Math.PI * radius * height);
	}
	
	/**
	 * Function to compute area
	 */
	public double computeVolume() {
		return (super.computeArea() * height);
	}

	/**
	 * Function to get radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Function to get height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @Override
	 */
	public String toString() {
		return super.toString() + "Radius = " + radius;
	}
}// end class Cylinder