import java.util.Random;

/**
 * @author Isaiah Beaudry, Chris Maude, Anthony Sanchez, Nathaniel Ventura
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PaymentStrategy lStrategy = new CreditCardStrategy("Zay", "1234 5678 9011 1213", "123", "01/23");
		ShoppingCart lCart = new ShoppingCart();
		Random lRandom = new Random();
		for (int i = 0; i < 5; i++) {
			lCart.addItem(new Item(Integer.toString(lRandom.nextInt()), lRandom.nextInt(50)));
		}
		lCart.pay(lStrategy);
		lStrategy = new PaypalStrategy("zay23@swellside.com", "Tribe33");
		lCart.pay(lStrategy);
	}
}