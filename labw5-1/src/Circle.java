/**
 *
 * @author Susan Nachawati
 *
 */
public class Circle extends Shape {
	private double radius;

	Circle() {
		super(); // call Shape
		radius = 0;
	}

// Overloaded constructor
	public Circle(double x, double y, double r) {
		super(x, y); // call Shape(x,y)
		radius = r;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public String toString() {
		return super.toString() + "Radius = " + radius;
	}
}// end class Circle