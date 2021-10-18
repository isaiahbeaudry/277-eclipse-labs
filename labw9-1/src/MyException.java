
public class MyException extends Exception {
	public MyException() {
		super("Speeding Ticket");
		System.out.println("You are driving reckless");
	}
	
	public MyException(String excp) {
		super("Speeding Ticket");
		System.out.println(excp);
	}

	@Override
	public String toString() {
		return "This is the MyException class.";
	}
}