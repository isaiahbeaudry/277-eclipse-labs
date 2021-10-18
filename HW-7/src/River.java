/**
 * River.java creates a River object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class River extends WaterObject {
	private int objImpScore = Impact(10, 60);
	
	public River() {
		category = "Water";
		terraObject = "River";
	}
	
	/**
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  /**
 *@Override
 */
public String toString(){
    return "I am a river " + getObjImpScore();
  }

}
