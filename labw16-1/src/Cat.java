
public class Cat implements State {

	private String type;
	private String state;
	/**
	 * Default Constructor
	 */
	public Cat(String iType) {
		this.type = iType;
	}
	
	@Override
	public void sleep() {
		state = "Asleep";
	}

	@Override
	public void eat() {
		state = "Hungry";
		
	}

	@Override
	public void play() {
		state = "Playful";
		
	}

	@Override
	public void ignore() {
		state = "Ignoring";
		
	}

	@Override
	public String toString() {
		return "Cat type = " + type + "\nState = " + state + "\n";
	}
}