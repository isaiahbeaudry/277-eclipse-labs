/**
 * @author isaiahbeaudry
 *
 */
public class Creatures implements Collection {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;

	// I want to implement it to have a list
	public Creature[] cList;

	public Creatures() {
		cList = new Creature[MAX_ITEMS];
		// Let us add some creatures
		addItem("Zomby 1");
		addItem("Zomby 2");
		addItem("Zomby 3");
	}

	public void addItem(String str) {
		Creature simpleC = new Creature(str);
		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Full");
		else {
			cList[numberOfItems] = simpleC;
			numberOfItems = numberOfItems + 1;
		}
	}

	@Override
	public Iterator getIterator() {
		return new CreatureIterator();
	}

	private class CreatureIterator implements Iterator {
		int index;
		
		@Override
		public boolean hasNext() {
			// implement hasNext so it returns 
			//True if we still have more element 
			//false otherwise
			return index < numberOfItems;
		}

		@Override
		public Object next() {
			// returns back the next element in the list, null otherwise
			return cList[index++];
		}
	}
}
