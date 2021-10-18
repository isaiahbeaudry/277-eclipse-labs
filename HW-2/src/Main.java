import java.util.ArrayList;
import java.util.Collections;

/**
 * This is our Main driver class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class Main {
	public static void main(String[] args) {
		DessertItem ca1 = new Candy("Corn(Candy)", 7.25, 1.5, 500);
		DessertItem ca2 = new Candy("Lollipop(Candy)", 8.25, 2.5, 640);
		DessertItem co1 = new Cookie("ChocChip(Cookie)", 4.99, 17, 250);
		DessertItem co2 = new Cookie("Oatmeal(Cookie)", 3.99, 15, 240);
		DessertItem ic1 = new IceCream("Vanilla(IceCream)", 10.05, 500);
		DessertItem ic2 = new IceCream("Chocolate(IceCream)", 9.99, 500);
		DessertItem s1 = new Sundae("Caramel(Sundae)", "HotFudge", .70, 600, 7.00);
		DessertItem s2 = new Sundae("Bannana Split(Sundae)", "Strawberries", .90, 560, 6.00);
		CheckOut itemList = new CheckOut();

		System.out.println("-----------------------------------------------------------");
		System.out.println("CANDY TEST: ");
		System.out.println(" ");
		System.out.println(ca1.toString() + "\n" + ca1.name + " calories: " + ca1.getCalories());
		System.out.println(" ");
		System.out.println(ca2.toString() + "\n" + ca2.name + " calories: " + ca2.getCalories());
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("COOKIE TEST: ");
		System.out.println(" ");
		System.out.println(co1.toString() + "\n" + co1.name + " calories: " + co1.getCalories());
		System.out.println(" ");
		System.out.println(co2.toString() + "\n" + co2.name + " calories: " + co2.getCalories());
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("ICECREAM TEST: ");
		System.out.println(" ");
		System.out.println(ic1.toString() + "\n" + ic1.name + " calories: " + ic1.getCalories());
		System.out.println(" ");
		System.out.println(ic2.toString() + "\n" + ic2.name + " calories: " + ic2.getCalories());
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("SUNDAE TEST: ");
		System.out.println(" ");
		System.out.println(s1.toString() + "\n" + s1.name + " calories: " + s1.getCalories());
		System.out.println(" ");
		System.out.println(s2.toString() + "\n" + s2.name + " calories: " + s2.getCalories() + "\n");
		System.out.println("-----------------------------------------------------------");

		// creating an arrayList with all the DessertItem items
		itemList.enterItem(ca1);
		itemList.enterItem(ca2);
		itemList.enterItem(co1);
		itemList.enterItem(co2);
		itemList.enterItem(ic1);
		itemList.enterItem(ic2);
		itemList.enterItem(s1);
		itemList.enterItem(s2);

		System.out.println(itemList);
		System.out.println("-----------------------------------------------------------");
		System.out.println("");

		// Testing for max with same DessertItem type
		System.out.println("Max Test with Same DessertItem Types: ");

		DessertItem x = DessertItem.max(ca1, ca2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (ca2.compareTo(ca1) == 0) {
			System.out.println(ca2.getName() + " with " + ca2.getCalories() + " is equal to " + ca1.getName() + " with "
					+ ca1.getCalories() + " calories.");
		}
		// using max results
		else if (x == ca1) {
			System.out.println(ca1.getName() + " with " + ca1.getCalories() + " is bigger than " + ca2.getName()
					+ " with " + ca2.getCalories() + " calories.");
		} else if (x == ca2) {
			System.out.println(ca2.getName() + " with " + ca2.getCalories() + " is bigger than " + ca1.getName()
					+ " with " + ca1.getCalories() + " calories.");
		}

		DessertItem x2 = DessertItem.max(co1, co2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (co2.compareTo(co1) == 0) {
			System.out.println(co2.getName() + " with " + co2.getCalories() + " is equal to " + co1.getName() + " with "
					+ co1.getCalories() + " calories.");
		}
		// using max results
		else if (x2 == co1) {
			System.out.println(co1.getName() + " with " + co1.getCalories() + " is bigger than " + co2.getName()
					+ " with " + co2.getCalories() + " calories.");
		} else if (x2 == co2) {
			System.out.println(co2.getName() + " with " + co2.getCalories() + " is bigger than " + co1.getName()
					+ " with " + co1.getCalories() + " calories.");
		}

		DessertItem x3 = DessertItem.max(ic1, ic2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (ic2.compareTo(ic1) == 0) {
			System.out.println(ic1.getName() + " with " + ic1.getCalories() + " is equal to " + ic2.getName() + " with "
					+ ic2.getCalories() + " calories.");
		}
		// using max results
		else if (x3 == ic1) {
			System.out.println(ic1.getName() + " with " + ic1.getCalories() + " is bigger than " + ic2.getName()
					+ " with " + ic2.getCalories() + " calories.");
		} else if (x3 == ic2) {
			System.out.println(ic2.getName() + " with " + ic2.getCalories() + " is bigger than " + ic1.getName()
					+ " with " + ic1.getCalories() + " calories.");
		}

		DessertItem x4 = DessertItem.max(s1, s2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (s2.compareTo(s1) == 0) {
			System.out.println(s1.getName() + " with " + s1.getCalories() + " is equal to " + s2.getName() + " with "
					+ s2.getCalories() + " calories.");
		}
		// using max results
		else if (x4 == s1) {
			System.out.println(s1.getName() + " with " + s1.getCalories() + " is bigger than " + s2.getName() + " with "
					+ s2.getCalories() + " calories.");
		} else if (x4 == s2) {
			System.out.println(s2.getName() + " with " + s2.getCalories() + " is bigger than " + s1.getName() + " with "
					+ s1.getCalories() + " calories.");
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("Max Test with Different DessertItem Types: ");

		DessertItem y = DessertItem.max(co2, ca2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (ca2.compareTo(co2) == 0) {
			System.out.println(co2.getName() + " with " + co2.getCalories() + " is equal to " + ca2.getName() + " with "
					+ ca2.getCalories() + " calories.");
		}
		// using max results
		else if (y == co2) {
			System.out.println(co2.getName() + " with " + co2.getCalories() + " is bigger than " + ca2.getName()
					+ " with " + ca2.getCalories() + " calories.");
		} else if (y == ca2) {
			System.out.println(ca2.getName() + " with " + ca2.getCalories() + " is bigger than " + co2.getName()
					+ " with " + co2.getCalories() + " calories.");
		}

		DessertItem y2 = DessertItem.max(s2, ic2);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (ic2.compareTo(s2) == 0) {
			System.out.println(s2.getName() + " with " + s2.getCalories() + " is equal to " + ic2.getName() + " with "
					+ ic2.getCalories() + " calories.");
		}
		// using max results
		else if (y2 == s2) {
			System.out.println(s2.getName() + " with " + s2.getCalories() + " is bigger than " + ic2.getName()
					+ " with " + ic2.getCalories() + " calories.");
		} else if (y2 == ic2) {
			System.out.println(ic2.getName() + " with " + ic2.getCalories() + " is bigger than " + s2.getName()
					+ " with " + s2.getCalories() + " calories.");
		}

		DessertItem y3 = DessertItem.max(ca1, ic1);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (ic1.compareTo(ca1) == 0) {
			System.out.println(ca1.getName() + " with " + ca1.getCalories() + " is equal to " + ic1.getName() + " with "
					+ ic1.getCalories() + " calories.");
		}
		// using max results
		else if (y3 == ca1) {
			System.out.println(ca1.getName() + " with " + ca1.getCalories() + " is bigger than " + ic1.getName()
					+ " with " + ic1.getCalories() + " calories.");
		} else if (y3 == ic1) {
			System.out.println(ic1.getName() + " with " + ic1.getCalories() + " is bigger than " + ca1.getName()
					+ " with " + ca1.getCalories() + " calories.");
		}

		DessertItem y4 = DessertItem.max(s1, co1);
		// max method does not check for same calories, using compareTo to check for
		// same qualities
		if (co1.compareTo(s1) == 0) {
			System.out.println(s1.getName() + " with " + s1.getCalories() + " is equal to " + co1.getName() + ") with "
					+ co1.getCalories() + " calories.");
		}
		// using max results
		else if (y4 == s1) {
			System.out.println(s1.getName() + " with " + s1.getCalories() + " is bigger than " + co1.getName()
					+ " with " + co1.getCalories() + " calories.");
		} else if (y4 == co1) {
			System.out.println(co1.getName() + " with " + co1.getCalories() + " is bigger than " + s1.getName()
					+ " with " + s1.getCalories() + " calories.");
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("The unsorted DessertList is: ");
		ArrayList<DessertItem> arrayItem = new ArrayList<DessertItem>();
		arrayItem.add(ca1);
		arrayItem.add(ca2);
		arrayItem.add(co1);
		arrayItem.add(co2);
		arrayItem.add(ic1);
		arrayItem.add(ic2);
		arrayItem.add(s1);
		arrayItem.add(s2);
		for (int i = 0; i < arrayItem.size(); i++) {
			System.out.println(arrayItem.get(i).getName() + " has " + arrayItem.get(i).getCalories() + " calories");
		}
		System.out.println("-----------------------------------------------------------");
		Collections.sort(arrayItem);
		System.out.println("The sorted DessertList is: ");
		for (int i = 0; i < arrayItem.size(); i++) {
			System.out.println(arrayItem.get(i).getName() + " has " + arrayItem.get(i).getCalories() + " calories");
		}

	}

}
