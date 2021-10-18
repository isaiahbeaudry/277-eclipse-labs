/**
 * This is our Cookie child class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class Cookie extends DessertItem {
	protected int numOfCookies;
	protected double cookiePrice;

	/**
	 * Default Constructor
	 */
	public Cookie() {
		super();
		this.numOfCookies = 0;
		this.cookiePrice = 0;
	}

	/**
	 * Overridden Constructor
	 * 
	 * @param Name
	 * @param price
	 * @param number
	 * @param Calories
	 */
	public Cookie(String Name, double price, int number, int Calories) {
		super(Name, Calories);
		this.cookiePrice = price;
		this.numOfCookies = number;
	}

	/**
	 * Returns number of cookies
	 * 
	 * @return numOfCookies of Cookie
	 */
	public int getNumOfCookies() {
		return numOfCookies;
	}

	/**
	 * Returns price of cookies
	 * 
	 * @return cookiePrice of Cookie
	 */
	public double getCookiePrice() {
		return cookiePrice;
	}

	/**
	 * Sets number of cookies
	 * 
	 * @param Number
	 */
	public void setNumOfCookies(int Number) {
		this.numOfCookies = Number;
	}

	/**
	 * Sets cookie price
	 * 
	 * @param Price
	 */
	public void setCookiePrice(double Price) {
		this.cookiePrice = Price;
	}

	/**
	 * @Override Returns cost of Cookie
	 */
	public double getCost() {
		return Math.round((numOfCookies * (cookiePrice / 12)) * 100.0) / 100.0;
	}

	/**
	 * @Override
	 */
	public String toString() {
		String s = "";
		s += numOfCookies + " @ " + cookiePrice + " /dz.\n";
		return s += String.format("%-30s", name + "            " + getCost());
	}

}
