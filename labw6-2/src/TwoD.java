/**
 * @author isaiahbeaudry
 *
 */
public class TwoD {

	private int x;
	private int y;
	private String color;
	
	/**
	 * Default Constructor
	 */
	public TwoD() {
		this.x = 0;
		this.y = 0;
		this.color = " ";
	}
	
	/**
	 * Overloaded Constructor
	 * @param ix
	 * @param iy
	 * @param icolor
	 */
	public TwoD(int ix, int iy, String icolor) {
		this.x = ix;
		this.y = iy;
		this.color = icolor;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
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
	 * twoDshape method
	 */
	public void twoDshape() {
		System.out.println("I am in the 2D shape class.");
	}
	
	public void info() {
		System.out.println("Color: " + color);
	}
}