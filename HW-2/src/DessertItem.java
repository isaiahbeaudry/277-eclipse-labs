/**
 * This is our DesertItem parent abstract class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public abstract class DessertItem implements Comparable<DessertItem> {

	protected String name;
	protected int calories;

	/**
	 * Null constructor for DessertItem class
	 */
	public DessertItem() {
		this.name = "";
		this.calories = 0;
	}

	public DessertItem(String Name, int Calories) {
		this.name = Name;
		this.calories = Calories;
	}

	/**
	 * Initializes DessertItem data
	 */
	public DessertItem(String name) {
		this.name = name;
	}

	/**
	 * Returns name of DessertItem
	 * 
	 * @return name of DessertItem
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Returns calories of Candy, Cookie, Ice Cream, and Sundae
	 * 
	 * @return calories of each object
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Sets calories of Candy, Cookie, Ice Cream, and Sundae
	 * 
	 * @param calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * Returns cost of DessertItem
	 * 
	 * @return cost of DessertItem
	 */
	public abstract double getCost();

	/**
	 * Returns max DesserItem
	 * @param item1
	 * @param item2
	 * @return max of two DessertItem's
	 */
	public static DessertItem max(DessertItem item1, DessertItem item2) {
		if (item2.compareTo(item1) < 0) {
			return item1;
		} else {
			return item2;
		}

	}

	/**
	 * Compares two DessertItem items
	 * 
	 * @param other
	 */
	public int compareTo(DessertItem other) {
		if (getCalories() < other.getCalories()) {
			return -1;
		} else if (getCalories() > other.getCalories()) {
			return 1;
		} else
			return 0;
	}

}