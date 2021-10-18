
public class Car implements Information {

	private int vin;
	
	public Car(int vin) {
		this.vin = vin;
	}
	
	public void move() {
		System.out.println("I am driving, vroom vroom...");
	}

	@Override
	public void inf() {
		// TODO Auto-generated method stub
		System.out.println("vin num: " + vin);
	}
}
