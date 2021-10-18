public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		s[0] = new Circle(10.0, 2.0, 5.0);
		Circle c2 = new Circle(5.0, 1.0, 3.0);
		s[1] = c2;
		s[2] = new Rectangle(10.0, 3.5, 12.1, 4.4);
		s[3] = new Cylinder(3.2, 7.6, 18.3, 90);
		s[4] = new Cylinder(1.0, 1.0, 1.0, 0.0);

		//Total area of all object
		double total = 0.0;
		for (int i = 0; i < s.length; i++) {

			total += s[i].computeArea();
		}

		//Total area of all Rectangle objects
		double sumArea = 0.0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] instanceof Rectangle) {
				sumArea += s[i].computeArea();
			}
		}
		System.out.println("Total area of all rectangles: " + sumArea);

		//Total volume of Cylinders
		double totalVolume = 0.0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] instanceof Cylinder) {
				totalVolume += ((Cylinder) s[i]).computeVolume();
			}
		}
	}
}
