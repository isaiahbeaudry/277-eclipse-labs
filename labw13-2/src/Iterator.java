/**
 * @author isaiahbeaudry
 *
 */
public interface Iterator {
	// indicates whether there are more elements to iterate over
	public boolean hasNext();

	// returns the next element
	public Object next();
}
