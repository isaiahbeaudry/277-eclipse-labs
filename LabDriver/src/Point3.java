/*
 * Point3 = subclass
 * Point = superclass
 */
public class Point3 extends Point{
	private int x;
	private int z;
	
	// Default Constructor
	public Point3() {
		super();
		z = 0;
	}
	
	// Overloaded Constructor
	public Point3(int m, int n, int p) {
		super(m, n);
		z = p;
	}
		
	// Setter
	public void setZ(int x) {
		z = x;
	}
		
	// Getter
	public int getZ() {
		return z;
	}
	
	// local variable b
	// x, y is attribute
	public void setX(int b) {
		x = b;
	}
	
	// Getters are accessors
	public int getX() {
		return x;
	}
		
	/**
	 * @Override
	 */
	public String toString() {
		return super.toString() + " z = " + z + x + super.getX();
	}
}
