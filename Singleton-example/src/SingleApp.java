/**
 * @author isaiahbeaudry
 *
 */
public class SingleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleC o1 = SingleC.getInstance();
		o1.setVal(99);
		System.out.println(o1);
		SingleC o2 = SingleC.getInstance();
		System.out.println(o2);
		// reflection / serialization
		SingleC o3 = null;
		System.out.println("Object 1 [" + o1.toString() + " | " + o1.hashCode() + "]");
		System.out.println("Object 2 [" + o2.toString() + " | " + o2.hashCode() + "]");
	}
}