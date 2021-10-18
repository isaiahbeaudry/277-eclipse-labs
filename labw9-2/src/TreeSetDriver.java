import java.util.TreeSet;

/**
 * @author Isaiah Beaudry, Chris Maude, Anthony Sanchez, Leslie Ortega, Ryo
 *         Fujimura
 *
 */
public class TreeSetDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> myTree = new TreeSet<String>();
		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");
		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");
		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");
		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");
		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");
		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");
		for (String lString : myTree) {
			System.out.println(lString);
		} // Each element only appears once, and they have been ordered
	}
}