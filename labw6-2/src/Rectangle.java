/**
 * @author isaiahbeaudry
 *
 */
public class Rectangle extends TwoD implements Shape, Info {

	/**
	 * Default Constructor
	 */
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor
	 * @param ix
	 * @param iy
	 * @param icolor
	 */
	public Rectangle(int ix, int iy, String icolor) {
		super(ix, iy, icolor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (getX() * 2) * (getY() * 2);
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (getX() + getX() + getX() + getX() + getY() + getY()+ getY() + getY());
	}

	/**
	 * twoDshape method
	 */
	public void twoDshape() {
		System.out.println("I am in the 2D shape rectangle.");
	}
	
	@Override
	public void info() {
		System.out.println("\nRectangle ");
		super.info();
		System.out.println("Area: " + area() + " Perimeter: " + perimeter());	
	} 
}