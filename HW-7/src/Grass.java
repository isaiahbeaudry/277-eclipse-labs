/**
 * Grass.java creates a Grass object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class Grass extends PlantObject{
	
	private int objImpScore = Impact(10, 30);
	
	/**
	 * Default Constructor
	 */
	public Grass() {
		category = "Plant";
		terraObject = "Grass";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am grass " + getObjImpScore();
  }

}
