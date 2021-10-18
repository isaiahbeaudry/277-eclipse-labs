import java.util.ArrayList;
import java.util.Collections;

public class ShipTester {

	public static void main(String[] args) {

//		// Create an array of type ship of size
//		Ship[] ships = new Ship[3];
//
//		// Initialize constructors
//		ships[0] = new Ship("Titanic", 1909);
//		ships[1] = new CruiseShip("Queen Mary", 1934, 2139);
//		ships[2] = new CargoShip("Aframax", 2004, 120000);
//		
//		
//		
//		// Print toString methods
//		for (int i = 0; i < ships.length; i++) {
//			System.out.println(ships[i].toString());
//		}
//		
		Ship s1 = new Ship("Sail Way", 2000);
		Ship s2 = new Ship("Water's Way", 2002);
		Ship cas1 = new CargoShip("Cargo Way", 1992, 200);
		Ship cas2 = new CargoShip("Ocean Way", 2004, 300);
		Ship Crs1 = new CruiseShip("Lake way", 1999, 150);
		Ship Crs2 = new CruiseShip("Sea Way", 2007, 500);

		ArrayList<Ship> arrayShip = new ArrayList<Ship>();
		arrayShip.add(s1);
		arrayShip.add(s2);
		arrayShip.add(cas1);
		arrayShip.add(cas2);
		arrayShip.add(Crs1);
		arrayShip.add(Crs2);

		Collections.sort(arrayShip);

		for (int i = 0; i < arrayShip.size(); i++) {
			System.out.println(arrayShip.get(i).getName() + " was built in " + arrayShip.get(i).getYear());
		}
	}
}