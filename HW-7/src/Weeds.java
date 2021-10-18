/**
 * Weeds.java creates a Weeds object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Weeds extends PlantObject{
	
	private int objImpScore = Impact(-30, 5);
	
	/**
	 * Default Constructor
	 */
	public Weeds() {
		category = "Plant";
		terraObject = "Weeds";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am weeds " + getObjImpScore();
  }

}
