/**
 * Flower.java creates a Flower object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Flower extends PlantObject{
	
	private int objImpScore = Impact(5, 20);
	
	/**
	 * Default Constructor
	 */
	public Flower() {
		category = "Plant";
		terraObject = "Flower";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a flower " + getObjImpScore();
  }

}