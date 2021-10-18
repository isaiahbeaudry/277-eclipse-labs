/**
 * Lake.java creates a Lake object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Lake extends WaterObject {
	private int objImpScore = Impact(40, 50);
	
	public Lake() {
		category = "Water";
		terraObject = "Lake";
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
    return "I am a lake " + getObjImpScore();
  }

}
