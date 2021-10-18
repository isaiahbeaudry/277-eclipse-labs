/**
 * This is our Tiger class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Tiger extends AnimalObject {
	private int objImpScore = Impact(-100, -50);
	
	/**
	 * Default Constructor
	 */
	public Tiger() {
		category = "Animal";
		terraObject = "Tiger";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a tiger " + getObjImpScore();
  }

}
