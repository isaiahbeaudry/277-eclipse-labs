/**
 * Ocean.java creates a Pond object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Ocean extends WaterObject {
	private int objImpScore = Impact(50, 100);
	
	public Ocean() {
		category = "Water";
		terraObject = "Ocean";
	}
	
	/**
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  /**
 * @Override
 */
public String toString(){
    return "I am a ocean " + getObjImpScore();
  }

}