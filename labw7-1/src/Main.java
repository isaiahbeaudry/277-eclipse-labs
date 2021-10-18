import foursidesPack.*;

/**
 * @author isaiahbeaudry
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Square s1 = new Square("Red", "Cube", "s1", "Square");
		Square s2 = new Rectangle("Blue", "Biggie", "s2", "Square");
		Rectangle r1 = new Rectangle("Yellow", "Rex", "r1", "Rectangle");
		Shape2D s3 = new Shape2D();
		
		// Works for s1
		System.out.println(s1.name);
		
		// does not work for s1
//		System.out.println(s1.color);
//		System.out.println(s1.type);
//		System.out.println(s1.make);
		
		
		// Works for s2
		System.out.println(s2.name);
		
		// does not work for s2
//		System.out.println(s2.color);
//		System.out.println(s2.type);
//		System.out.println(s2.make);
//				
		
		// Works for r1
		System.out.println(r1.name);
		
		// does not work for r1
//		System.out.println(r1.color);
//		System.out.println(r1.type);
//		System.out.println(r1.make);
						
		
		// Works for s3
		System.out.println(s3.name);
	}
}