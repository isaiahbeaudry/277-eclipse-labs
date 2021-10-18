/**
 *
 * @author Isaiah Beaudry
 *
 */
public class Rectangle extends Shape {
	private double height;
	private double width;

	/**
	 * Default Constructor
	 */
	Rectangle() {
		super(); // call Shape
		height = 0;
		width = 0;
	}

	/**
	 * Overloaded constructor
	 * @param x
	 * @param y
	 * @param iheight
	 * @param iwidth
	 */
	public Rectangle(double x, double y, double iheight, double iwidth) {
		super(x, y); // call Shape(x,y)
		height = iheight;
		width = iwidth;
	}

	/**
	 * Function to compute area 
	 */
	public double computeArea() {
		return height * width;
	}

	/**
	 *  Function to get height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Function to get width
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @Override
	 */
	public String toString() {
		return super.toString() + "Height = " + height + "Width = " + width;
	}
}// end class Rectangle