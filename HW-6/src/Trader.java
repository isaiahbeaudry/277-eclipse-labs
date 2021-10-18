/**
 * This is our Trader class which implements Observer.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Apr. 21 2021)
 */
public class Trader implements Observer {
	private String name;

	/**
	 * Default Constructor
	 * 
	 * @param name
	 */
	public Trader(String name) {
		this.name = name;
		// name.addObserver(this);
	}

	/**
	 * Updates the latest trade
	 */
	public void update(Object newTrade) {
		Trade latestTrade = (Trade) newTrade;
		display(latestTrade);
	}

	/**
	 * Gets the name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Displays the trade results
	 * 
	 * @param latestTrade
	 */
	public void display(Trade latestTrade) {
		System.out.println("The latest trade is " + latestTrade.toString());
	}
}
