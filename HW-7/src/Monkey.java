/**
 * This is our Monkey class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Monkey extends AnimalObject {
	private int objImpScore = Impact(-70, -40);

	/**
	 * Default Constructor
	 */
	public Monkey() {
		category = "Animal";
		terraObject = "Monkey";
	}

	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a monkey " + getObjImpScore();
  }

}
