import java.util.ListIterator;
import java.util.LinkedList;

/**
 * @author Isaiah Beaudry, Chris Maude, Anthony Sanchez, Leslie Ortega, Ryo
 *         Fujimura
 *
 */
public class LinkedListDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("aaa");
		myList.add("bbb");
		myList.add("ccc");
		myList.add("ddd");
		myList.add("eee");
		myList.add("fff");
		myList.add("ggg");
		myList.add("hhh");
		myList.add("iii");
		ListIterator<String> lIterator = myList.listIterator();
		while (lIterator.hasNext()) {
			System.out.println(lIterator.next());
		}
		System.out.println("Now removing all vowels and going back through list:");
		while (lIterator.hasPrevious()) {
			if (HasVowel(lIterator.previous())) {
				lIterator.remove();
			}
		}
		while (lIterator.hasNext()) {
			System.out.println(lIterator.next());
		}
	}

	private static boolean HasVowel(String iString) {
		String lVowels = "aeiou";
		for (char lChar : lVowels.toCharArray()) {
			if (iString.charAt(0) == lChar) {
				return true;
			}
		}
		return false;
	}
}