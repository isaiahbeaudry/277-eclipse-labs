/**
 * This is our Dog class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Dog extends AnimalObject {
	private int objImpScore = Impact(-40, 0);

	/**
	 * Default Constructor
	 */
	public Dog() {
		category = "Animal";
		terraObject = "Dog";
	}

	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a dog " + getObjImpScore();
  }

}
