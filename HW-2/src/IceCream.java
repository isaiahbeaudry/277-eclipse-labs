/**
 * This is our IceCream child class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class IceCream extends DessertItem {
	protected double IceCreamPrice;

	/**
	 * Default Constructor
	 */
	public IceCream() {
		super();
		this.IceCreamPrice = 0;
	}

	/**
	 * Overridden Constructor
	 * 
	 * @param Name
	 * @param price
	 * @param Calories
	 */
	public IceCream(String Name, double price, int Calories) {
		super(Name, Calories);
		this.IceCreamPrice = price;
	}

	/**
	 * Returns price of IceCream
	 * 
	 * @return IceCreamPrice of IceCream
	 */
	public double getIceCreamPrice() {
		return IceCreamPrice;
	}

	/**
	 * Sets price of IceCream
	 * 
	 * @param Price
	 */
	public void setIceCreamPrice(double Price) {
		this.IceCreamPrice = Price;
	}

	/**
	 * @Override Returns cost of IceCream
	 */
	public double getCost() {
		return Math.round((IceCreamPrice) * 100.0) / 100.0;
	}

	/**
	 * @Override
	 */
	public String toString() {
		return String.format("%-30s", name + "            " + IceCreamPrice);
	}

}