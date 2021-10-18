import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author isaiahbeaudry
 *
 */
public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(0, 1);
		System.out.println(numbers);
		List<Integer> linkedList = new LinkedList<Integer>();
		
		Set<String> set1 = new TreeSet<String>();
		//Iterator<String> it = set1.iterator();
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding (not!)");
		}
		
		set1.add("mouse"); // does nothing
		
		System.out.println(set1);
	}
}