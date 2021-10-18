import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
/**
 * @author isaiahbeaudry
 *
 */
public class BetterRectangle extends Rectangle {

	public BetterRectangle() {
		super();
	}
	
	public BetterRectangle(Dimension d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public BetterRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public BetterRectangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public BetterRectangle(Point p, Dimension d) {
		super(p, d);
		// TODO Auto-generated constructor stub
	}

	public BetterRectangle(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public BetterRectangle(Rectangle r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	public void getPerimeter() {
		System.out.println(this.x + this.y + this.width + this.height);
	}
	
	public void getArea() {
		System.out.println(this.width * this.height);
	}
}
