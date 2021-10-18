/**
 * @author isaiahbeaudry
 *
 */
public class BabyMonitor {

	int temp;
	BabaReport dadDisplay; 
	MamaReport momDisplay;
	DoctorReport docDisplay;
	SiblingReport sibDisplay;

	// add more variables BabaReport dadDisplay; MamaReport momDisplay;
	// Constructor
	public BabyMonitor(BabaReport dadDisplay, MamaReport momDisplay, DoctorReport idocDisplay, SiblingReport isibDisplay) {
		this.dadDisplay = dadDisplay;
		this.momDisplay = momDisplay;
		this.docDisplay = idocDisplay;
		this.sibDisplay = isibDisplay;
	}

	// Get latest temperature
	private int getTemp() {
		return 97;
	}

	// get latest sound cry, giggle
	// This method is used update displays when data changes
	public void dataChanged() {
		// get latest data
		temp = getTemp();
		dadDisplay.update(temp);
		momDisplay.update(temp);
		docDisplay.update(temp);
		sibDisplay.update(temp);
	}
	// 97 normal
}
