/**
 * This is our Sundae child class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class Sundae extends IceCream {
	protected String topping;
	protected double toppingPrice;

	/**
	 * Default Constructor
	 */
	public Sundae() {
		super();
		this.toppingPrice = 0;
	}

	/**
	 * Overridden Constructor
	 * 
	 * @param Name
	 * @param Topping
	 * @param Price
	 * @param Calories
	 * @param IceCreamPrice
	 */
	public Sundae(String Name, String Topping, double Price, int Calories, double IceCreamPrice) {
		super(Name, IceCreamPrice, Calories);
		this.topping = Topping;
		this.toppingPrice = Price;
	}

	/**
	 * Returns topping of Sundae
	 * 
	 * @return topping of Sundae
	 */
	public String getTopping() {
		return topping;
	}

	/**
	 * Returns price of topping
	 * 
	 * @return toppingPrice of Sundae
	 */
	public double getToppingPrice() {
		return toppingPrice;
	}

	/**
	 * Sets topping of Sundae
	 * 
	 * @param Topping
	 */
	public void setTopping(String Topping) {
		this.topping = Topping;
	}

	/**
	 * Set price of topping
	 * 
	 * @param Price
	 */
	public void setToppingPrice(int Price) {
		this.toppingPrice = Price;
	}

	/**
	 * @Override Returns cost of Sundae
	 */
	public double getCost() {
		double total = 0.00;
		total = IceCreamPrice + toppingPrice;
		return Math.round((total) * 100.00) / 100.00;
	}

	/**
	 * @Override
	 */
	public String toString() {
		return String.format("%-40s", name + " with " + topping + "            " + getCost());
	}

}
