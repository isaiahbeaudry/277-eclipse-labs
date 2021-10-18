/**
 *
 * @author Isaiah Beaudry, Phoenix Ngan, David Cuevas, Lincoln Vunguyen, Tien Nguyen 
 *
 */
public class Rectangle {
	private double length;
	private double width;

	/**
	 * Private Constructor
	 */
	private Rectangle() {}

	/**
	 * InnerRect instance
	 */
	private static class InnerRect {
		private static Rectangle r1 = new Rectangle();
	}
	
	/**
	 * getInstance method
	 * @return InnerRect.r1
	 */
	public static Rectangle getInner() {
		return InnerRect.r1;
	}
	
	/**
	 *  instantiate a private static Rectangle object
	 */
	public static final Rectangle INSTANCE = new Rectangle();
	
	/**
	 *  getInstance method to return back the instance
	 * @return INSTANCE
	 */
	
	public static Rectangle getInstance() {
		return INSTANCE;
	}
	
	// Lazy instantiation
	public static Rectangle lazyInst = new Rectangle();
	
	public static synchronized Rectangle getLazyInst() {
		if (lazyInst == null) {
			lazyInst = new Rectangle();
		}
		return lazyInst;
	}
	
	/**
	 * Function to compute area 
	 * @return length * width
	 */
	public double getArea() {
		return length * width;
	}
	
	/**
	 * Function to compute perimeter 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}

	/**
	 *  Function to set length
	 */
	public void setLength(double x) {
		length = x;
	}
	
	/**
	 *  Function to get length
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 *  Function to set width
	 */
	public void setWidth(double x) {
		width = x;
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
		return "Length = " + length + "\tWidth = " + width + "\tArea = " + getArea() +  "\tPerimeter = " + getPerimeter();
	}
}// end class Rectangle