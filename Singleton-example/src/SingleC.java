/**
 * @author isaiahbeaudry
 *
 */
public class SingleC {
	private int val;
	
	// private constructor
	private SingleC() {}
	
	private static class InnerS {
		private static SingleC o = new SingleC();
	}
	
	public static SingleC getInstance() {
		return InnerS.o;
	}
	/**
	 *  instantiate a private static SingleC object
	 */
	//public static final SingleC INSTANCE = new SingleC();
	
	/**
	 *  getInstance method to return back the object
	 * @return INSTANCE
	 */
	
	/*public static SingleC getInstance() {
		return INSTANCE;
	}*/
	
	// instance 2
	//public static SingleC INSTANCE = new SingleC();
/*	
	public static synchronized SingleC getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingleC();
		}
		return INSTANCE;
	}
*/
	/**
	 * @override toString
	 * @return val
	 */
	public String toString() {
		return "" + val;
	}
	
	/**
	 * setVal method
	 * @param x
	 */
	public void setVal(int x) {
		val = x;
	}
}
