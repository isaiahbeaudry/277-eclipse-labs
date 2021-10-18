/**
 * This is our Candy child class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 17 2021)
 */
public class Candy extends DessertItem {
	protected double candyWeight;
	protected double candyPrice;

	/**
	 * Default Constructor
	 */
	public Candy() {
		super();
		this.candyWeight = 0;
		this.candyPrice = 0;
	}

	/**
	 * Overridden Constructor
	 * 
	 * @param Name
	 * @param price
	 * @param weight
	 * @param Calories
	 */
	public Candy(String Name, double price, double weight, int Calories) {
		super(Name, Calories);
		this.candyPrice = price;
		this.candyWeight = weight;
	}

	/**
	 * Returns weight of Candy
	 * 
	 * @return candyWeight of Candy
	 */
	public double getCandyWeight() {
		return candyWeight;
	}

	/**
	 * Returns price of Candy
	 * 
	 * @return candyPrice of Candy
	 */
	public double getCandyPrice() {
		return candyPrice;
	}

	/**
	 * Sets weight of Candy
	 * 
	 * @param Weight
	 */
	public void setCandyWeight(double Weight) {
		this.candyWeight = Weight;
	}

	/**
	 * Sets price of Candy
	 * 
	 * @param Price
	 */
	public void setCandyPrice(double Price) {
		this.candyPrice = Price;
	}

	/**
	 * @Override Returns cost of Candy
	 */
	public double getCost() {
		return Math.round((candyPrice * candyWeight) * 100.0) / 100.0;
	}

	/**
	 * @Override
	 */
	public String toString() {
		String s = "";
		s += candyWeight + " lbs. @ " + candyPrice + "/lb.\n";
		return s += String.format("%-30s", name + "            " + getCost());
	}

}
