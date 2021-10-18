/**
 * @author isaiahbeaudry
 *
 */
public class Circle extends TwoD implements Shape, Info {

	/**
	 * Default Constructor
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded Constructor
	 * @param ix
	 * @param iy
	 * @param icolor
	 */
	public Circle(int ix, int iy, String icolor) {
		super(ix, iy, icolor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) (Math.PI * getX() * getX());
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) (2 * Math.PI * getX() * getX());
	}

	/**
	 *  twoDshape method
	 */
	public void twoDshape() {
		System.out.println("I am in the 2D shape circle.");
	}
	
	@Override
	public void info() {
		System.out.println("\nCircle ");
		super.info();
		System.out.println("Area: " + area() + " Perimeter: " + perimeter());	
	}
}