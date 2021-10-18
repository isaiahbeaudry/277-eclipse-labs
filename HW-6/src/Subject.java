/**
 * This is our Subject interface.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Apr. 21 2021)
 */
public interface Subject {

	/**
	 * Method to add observers
	 * 
	 * @param o
	 */
	public void addObserver(Observer o);

	/**
	 * Method to remove observers
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * Method to notify observers
	 */
	public void notifyObservers();
}