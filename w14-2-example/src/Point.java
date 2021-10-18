
public class Point {

	private int x;
	private int y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	// Cartesian x, y
	
	// Polar rho, theta
//	public Point(int rho, int theta) {
//		x = rho;
//		y = theta;
//	}
	public Point(int a, int b, CoordinateSystem cs) {
		switch(cs) {
		case CARTESIAN:
			this.x = a;
			this.y = b;
			break;
		case POLAR:
			this.x = a * Math.cos(b);
			this.y = b * Math.cos(b);
			break;
		}
	}
}
