/**
 * @author Isaiah Beaudry, Chris Maude, Anthony Sanchez, Nathaniel Ventura
 *
 */
public class PaypalStrategy implements PaymentStrategy {

	private String emailid;
	private String password;

	public PaypalStrategy(String iemail, String ipassword) {
		emailid = iemail;
		password = ipassword;
	}

	@Override
	public void pay(int iamount) {
		System.out.println(
				"This was a Paypal payment of: $" + iamount + "\n\tEmail: " + emailid + "\n\tPassword: " + password);
	}
}