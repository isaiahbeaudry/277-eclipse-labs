
public class Tester {

	public static void main(String[] args) {
		
		Information obj1 = new Kid("Danny");
		Information obj2 = new Car(12345678);
		
		obj1.inf();
		obj2.inf();
		
		
		Kid k1 = new Kid("Suzy");
		Car c1 = new Car(98);
		
		k1.move();
		c1.move();
		
		((Kid) obj1).move();
		((Car) obj2).move();
		
		data(obj1);
		data(k1);
		data(c1);
		
		
		
	}
	
	public static void data(Information objs) {
		objs.inf();
	}
}
