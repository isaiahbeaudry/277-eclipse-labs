import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author isaiahbeaudry
 *
 */
public class BabyData implements Subject {

	private int temps ;
	
	ArrayList<Observer> obsvList;
	// add more variables BabaReport dadDisplay; MamaReport momDisplay;
	// Constructor
	public BabyData() {
		obsvList = new ArrayList<Observer>();
	}

	// Get latest temperature
	private int getTemps() {
		return temps;
	}

	// This method is used update displays when data changes
	public void update() {
		// get latest data
		this.temps = getTemps();
	}

	@Override
	public void registerObserver(Observer o) {
		obsvList.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		obsvList.remove(obsvList.indexOf(o));
		
	}

	@Override
	public void notifys() {
		for (Iterator<Observer> it = obsvList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(temps);
		}
	}
}
