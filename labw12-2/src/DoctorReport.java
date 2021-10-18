
public class DoctorReport {
	private float tempRate;
	private String state;

	public void update(int temp) {
		this.tempRate = (float) ((temp - 32) / 1.8); // (F - 32) / 1.8 = °C if (tempRate > 97)
		if (tempRate < 37)
			this.state = "Healthy";
		else
			this.state = "Sick";
		display();
	}

	public void display() {
		System.out.println("\nTemperature Display:\n" + "Temperature: " + tempRate + "\nBabyState: " + state);
	}
}
