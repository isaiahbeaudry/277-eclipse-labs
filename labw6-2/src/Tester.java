/**
 * @author isaiahbeaudry
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape obj1 = new Rectangle(10, 10, "Red");
		Shape obj2 = new Circle(5, 5, "Blue");
		
		Rectangle r1 = new Rectangle(10, 10, "Pink");
		Circle c1 = new Circle(5, 5, "Yellow");
		
//		System.out.println("obj1 area: " + ((Rectangle) obj1).area());
//		System.out.println("obj1 perimeter: " +((Rectangle) obj1).perimeter());
//		System.out.println("obj2 area: " +((Circle) obj2).area());
//		System.out.println("obj2 perimeter: " +((Circle) obj2).perimeter());
		
		// dataShape method calls
		dataShape(obj1);
		dataShape(obj2);
		dataShape(r1);
		dataShape(c1);
		
		// dataInfo method calls
//		dataInfo(obj1); // These first two method calls do not work;
//		dataInfo(obj2); // They both have errors
		dataInfo(r1);
		dataInfo(c1);
	}
	
	/**
	 * dataShape prints area and perimeter
	 * @param objs
	 */
	public static void dataShape(Shape objs) {
		System.out.println("Area: " + objs.area());
		System.out.println("Perimeter: " + objs.perimeter());
	}
	
	/**
	 * dataInfo prints info
	 * @param objs
	 */
	public static void dataInfo(Info objs) {
		objs.info();
	}
}
