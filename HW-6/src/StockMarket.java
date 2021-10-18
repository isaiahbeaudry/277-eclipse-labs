/**
 * This is our StockMarket class which runs our program.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Apr. 21 2021)
 */
public class StockMarket {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stock MSFT = new Stock("MSFT");
		Stock AAPL = new Stock("AAPL");
		Stock GOOG = new Stock("GOOG");

		Trader Julie = new Trader("Julie");
		Trader Amy = new Trader("Amy");
		Trader Suzy = new Trader("Suzy");

		MSFT.submitTrade(new Trade(Julie, 160, MSFT, "buy"));
		AAPL.submitTrade(new Trade(Julie, 185, AAPL, "buy"));
		GOOG.submitTrade(new Trade(Julie, 170, GOOG, "buy"));
		MSFT.submitTrade(new Trade(Amy, 160, MSFT, "buy"));
		AAPL.submitTrade(new Trade(Amy, 185, AAPL, "buy"));
		GOOG.submitTrade(new Trade(Amy, 170, GOOG, "buy"));
		MSFT.submitTrade(new Trade(Suzy, 160, MSFT, "buy"));
		AAPL.submitTrade(new Trade(Suzy, 185, AAPL, "buy"));
		GOOG.submitTrade(new Trade(Suzy, 170, GOOG, "buy"));
		MSFT.submitTrade(new Trade(Julie, 160, MSFT, "sell"));
		AAPL.submitTrade(new Trade(Amy, 185, AAPL, "sell"));
		GOOG.submitTrade(new Trade(Suzy, 170, GOOG, "sell"));
	}
}