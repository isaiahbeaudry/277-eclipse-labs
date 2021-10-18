import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Isaiah Beaudry, Josh Reyes, Niklas Klimpfinger, Nathaniel Ventura,
 *         Anthony Sanchez, Jason Morales
 *
 */
public class HashDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Set<String>> names = new HashMap<String, Set<String>>();
		Set<String> SueSet = new HashSet<String>();
		Set<String> CathySet = new HashSet<String>();
		Set<String> BobSet = new HashSet<String>();
		SueSet.add("Bob");
		SueSet.add("Jose");
		SueSet.add("Alex");
		SueSet.add("Cathy");
		names.put("Sue", SueSet);
		
		CathySet.add("Bob");
		CathySet.add("Alex");
		names.put("Cathy", CathySet);
		
		BobSet.add("Alex");
		BobSet.add("Jose");
		BobSet.add("Jerry");
		names.put("Bob", BobSet);

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a name:");
		String name = in.nextLine();

		if (names.containsKey(name)) {
			Set<String> friends = names.get(name);
			System.out.println(name + " is friends with " + friends);
		} else {
			System.out.println("The name " + name + " does not exist in the map.");
		}
	}
}