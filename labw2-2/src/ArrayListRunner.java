import java.util.ArrayList; 
public class ArrayListRunner {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		// prints out the ArrayList it is empty [ ]
		System.out.println("names: " + names); 
		
		// adds names to the ArrayList
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		
		// prints out the ArrayList with names
		System.out.println("names: " + names); 
		
		// prints out first name in list
		System.out.println("first name in list: " + names.get(0)); 
		
		// prints out last name in list
		System.out.println("last name in list: " + names.get(7));
		
		// prints out the size of the ArrayList
		System.out.println("size of names: " + names.size());
		
		// print out the last element using size()
		System.out.println("last name using size(): " + names.get(names.size() - 1));
		
		// changes first name in the ArrayList
		names.set(0, "Alice B. Toklas");
		System.out.println("change Alice in list: " + names);
		
		// adds Doug after David then prints the ArrayList
		names.add(4, "Doug");
		System.out.println("add Doug after David: " + names);
		
		// Enhanced for-loop
		for (String s: names)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Creates new ArrayList copy of names
		ArrayList<String> names2 = new ArrayList<String>(names);
		
		// Removes first element of names
		names.remove(0);
		
		// Checks contents of both ArrayLists
		System.out.println("names: " + names);
		System.out.println("names2: " + names2);
	}
}