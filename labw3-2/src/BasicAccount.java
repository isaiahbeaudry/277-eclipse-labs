/**
 * @author Isaiah Beaudry, Rainier Marlone Getuaban 
 *
 */
public class BasicAccount extends BankAccount {
	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BasicAccount() {
		super();
	}
	
	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BasicAccount(double balance) {
		super(balance);
	}
	
	/**
	 * Withdraws money from the bank account. @param amount the amount to withdraw
	 */
	public void withdraw(double amount) {
		if (super.getBalance() < amount) {
			System.out.println("Withdraw amount can't be larger than the balance.");
			PenaltyWithdraw();
		}
		else {
			super.withdraw(amount);
		}
	}

	public void PenaltyWithdraw( ) {
		super.withdraw(30);
	}

}
