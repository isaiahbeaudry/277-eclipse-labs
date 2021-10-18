
public class Kid implements Information {
	
	private String name;
	
	public Kid(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println("I am walking");
	}

	@Override
	public void inf() {
		// TODO Auto-generated method stub
		System.out.println("name: " + name);
	}
}
