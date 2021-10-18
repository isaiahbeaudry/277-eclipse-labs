import java.util.ArrayList;

/**
 * This is our Stock class which implements Subject.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Apr. 21 2021)
 */
public class Stock implements Subject {
	private ArrayList<Observer> observers;
	private Trade latestTrade;
	private String stockName;

	/**
	 * Default Constructor
	 * 
	 * @param stockName
	 */
	public Stock(String stockName) {
		observers = new ArrayList<Observer>();
		// stockName.addObserver(this)
		this.stockName = stockName;
	}

	/**
	 * Adds a registered observer
	 */
	public void addObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * Removes a registered observer
	 */
	public void removeObserver(Observer o) {
		observers.remove(0);
	}

	/**
	 * Gets the stock name
	 * 
	 * @return stockName
	 */
	public String getSN() {
		return stockName;
	}

	/**
	 * Notify all registered observers
	 */
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = observers.get(i);
			obs.update(latestTrade);
		}
	}

	/**
	 * Traders invoke this method when they submit a bid
	 */
	public void submitTrade(Trade latestTrade) {
		this.latestTrade = latestTrade;

		// notify all registered traders (observers)
		notifyObservers();
	}
}