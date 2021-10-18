/**
 * Diamond.java creates a diamond object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Diamond extends MineralObject {
	private int objImpScore = Impact(10, 30);
	
	/**
	 * Default Constructor
	 */
	public Diamond() {
		category = "Mineral";
		terraObject = "Diamond";
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
		return "I am a diamond " + getObjImpScore();
	}

}
