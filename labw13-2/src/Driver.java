/**
 * @author isaiahbeaudry
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Creatures monsters = new Creatures();
		
		for (Iterator iter = monsters.getIterator(); iter.hasNext();) {
			Creature name = (Creature) iter.next();
			System.out.println("Name : " + name);
		}

	}

}
