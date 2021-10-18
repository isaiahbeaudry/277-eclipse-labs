import java.util.ArrayList;

/**
 * This is our CheckOut class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class CheckOut {
	ArrayList<DessertItem> c = new ArrayList<DessertItem>();

	/**
	 * Null constructor for Cookie class
	 */
	public CheckOut() {
		c.isEmpty();
	}

	/**
	 * Clears arraylist of DessertItems
	 */
	public void clear() {
		c.clear();
	}

	/**
	 * Adds item to Arraylist
	 */
	public void enterItem(DessertItem item) {
		c.add(item);
	}

	/**
	 * Returns number of items in arraylist
	 * 
	 * @return number of items in arraylist
	 */
	public int numberOfItems() {
		return c.size();
	}

	/**
	 * Returns totalCost of Checkout
	 * 
	 * @return totalCost of Checkout
	 */
	public double totalCost() {
		double totalCost = 0.0;
		for (int i = 0; i < c.size(); i++) {
			totalCost += c.get(i).getCost();

		}
		totalCost = Math.round(totalCost * 100.0) / 100.0;
		return totalCost;
	}

	/**
	 * Returns tax of Checkout
	 * 
	 * @return tax of Checkout
	 */
	public double getTax() {
		double tax = 7.75;
		return Math.round((totalCost() * tax)) / 100.0;
	}

	/**
	 * Returns output of Cookie
	 * 
	 * @return output of Cookie
	 */
	public String toString() {
		String r = "Dessert Shop\n";
		r += "Number of items: " + c.size() + "\n" + "Total Cost: " + totalCost() + "\n" + "Total tax: " + getTax()
				+ "\n" + "Cost + Tax: " + (totalCost() + getTax());
		r += "\n\n";
		for (int i = 0; i < c.size(); i++) {
			r += c.get(i).toString();
			r += "\n";
		}
		r += String.format("%-30s %20s", "Tax", getTax());
		r += "\n";
		r += String.format("%-30s %20s", "TotalCost", totalCost() + getTax());
		return r;
	}

}