/**
 * This is our Bear class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Bear extends AnimalObject {
	private int objImpScore = Impact(-100, -60);

	/**
	 * Default Constructor
	 */
	public Bear() {
		category = "Animal";
		terraObject = "Bear";
	}

	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a bear " + getObjImpScore();
  }

}
