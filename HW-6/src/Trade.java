/**
 * This is our Trade class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Apr. 21 2021)
 */
public class Trade {
	private Trader trader;
	private double price;
	private Stock stock;
	private String action;

	/**
	 * Default Constructor
	 * 
	 * @param trader
	 * @param price
	 * @param stock
	 * @param action
	 */
	public Trade(Trader trader, double price, Stock stock, String action) {
		this.trader = trader;
		this.price = price;
		this.stock = stock;
		this.action = action;
		if (action.equals("buy")) {
			stock.addObserver(trader);
		} else if (action.equals("sell")) {
			stock.removeObserver(trader);
		}
	}

	/**
	 * @override
	 */
	public String toString() {
		return "Trader: " + trader.getName() + " " + action + " $" + price + ":" + stock.getSN();
	}
}
