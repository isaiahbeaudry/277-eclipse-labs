/**
 * Coal.java creates a coal object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Coal extends MineralObject {
	private int objImpScore = Impact(-10, 20);
	
	/**
	 * Default Constructor
	 */
	public Coal() {
		category = "Mineral";
		terraObject = "Coal";
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
		return "I am coal " + getObjImpScore();
	}
}
