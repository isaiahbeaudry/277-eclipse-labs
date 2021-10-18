/**
 * @author Isaiah Beaudry, Phoenix Ngan, David Cuevas, Lincoln Vunguyen, Tien Nguyen 
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// inner method instance
		Rectangle o1 = Rectangle.getInner();
		o1.setLength(2);
		o1.setWidth(3);
		Rectangle o2 = Rectangle.getInner();
		System.out.println("Object 1 [" + o1.toString() + " | " + o1.hashCode() + "]");
		System.out.println("Object 2 [" + o2.toString() + " | " + o2.hashCode() + "]");
		
		// instantiate a private variable
		Rectangle o3 = Rectangle.getInstance();
		o3.setLength(3);
		o3.setWidth(3);
		Rectangle o4 = Rectangle.getInstance();
		System.out.println("Object 3 [" + o3.toString() + " | " + o3.hashCode() + "]");
		System.out.println("Object 4 [" + o4.toString() + " | " + o4.hashCode() + "]");
		
		// lazy synchronized instance
		Rectangle o5 = Rectangle.getLazyInst();
		o5.setLength(4);
		o5.setWidth(5);
		Rectangle o6 = Rectangle.getLazyInst();
		System.out.println("Object 5 [" + o5.toString() + " | " + o5.hashCode() + "]");
		System.out.println("Object 6 [" + o6.toString() + " | " + o6.hashCode() + "]");
	}
}