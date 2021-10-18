/**
 * Pond.java creates a Pond object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Pond extends WaterObject {
	private int objImpScore = Impact(5, 10);
	
	public Pond() {
		category = "Water";
		terraObject = "Pond";
	}
	
	/**
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  /**
 * @Overide
 */
public String toString(){
    return "I am a pond " + getObjImpScore();
  }

}