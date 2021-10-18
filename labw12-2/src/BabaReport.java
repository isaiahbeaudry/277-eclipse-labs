
public class BabaReport {
	private int temps;// F
	// add 2 more private data

	public void update(int temp) {
		this.temps = temp;
		display();
	}

	public void display() {
		System.out.println("\nCurrent Baby: \n" + "Temperature: " + temps);
	}
}
