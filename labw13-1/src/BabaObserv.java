
public class BabaObserv implements Observer {

	private int temps;
	
	@Override
	public void update(int temp) {
		this.temps = temp;
		display();
		
	}
	
	public void display() {
		System.out.println("\nCurrent Baby: \n" + "Temperature: " + temps);
	}

}
