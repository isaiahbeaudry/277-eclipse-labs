
public class Point {
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	// Overload
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	// Setters are mutators
	public void setX(int a) {
		x = a;
	}
	
	// local variable b
	// x, y is attribute
	public void setY(int b) {
		this.y = b;
	}
	
	// Getters are accessors
	public int getX() {
		return x;
	}
	
	public int getY() {
		return this.y;
	}
	
	/**
	 * @Override
	 * 
	 */
	public String toString() {
		return "(x,y) = (" + x + "," + y + ")";
	}
}