/**
 * @author Isaiah Beaudry, Chris Maude, Anthony Sanchez, Nathaniel Ventura
 *
 */
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardnumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String iname, String icardnumber, String icvv, String idateOfExpiry) {
		name = iname;
		cardnumber = icardnumber;
		cvv = icvv;
		dateOfExpiry = idateOfExpiry;
	}

	@Override
	public void pay(int iamount) {
		System.out.println("This was a Credit Card payment of: $" + iamount + "\n\tCard Holder: " + name
				+ "\n\tCard Number: " + cardnumber + "\n\tCVV: " + cvv + "\n\tExpiration: " + dateOfExpiry);
	}
}