/**
 * Iron.java creates a iron object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Iron extends MineralObject {
	private int objImpScore = Impact(-20, 20);
	
	/**
	 * Default Constructor
	 */
	public Iron() {
		category = "Mineral";
		terraObject = "Iron";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

	/**
	 * @return what mineral object it is and its impact score
	 */
	public String toString(){
		return "I am iron " + getObjImpScore();
	}

}
