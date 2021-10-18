/**
 * Gold.java creates a gold object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Gold extends MineralObject {
	private int objImpScore = Impact(-5, 50);
	
	/**
	 * Default Constructor
	 */
	public Gold() {
		category = "Mineral";
		terraObject = "Gold";
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
		return "I am gold " + getObjImpScore();
	}

}

