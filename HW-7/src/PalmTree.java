/**
 * PalmTree.java creates a PalmTree object with an impact score
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class PalmTree extends PlantObject{
	
	private int objImpScore = Impact(20, 80);
	
	/**
	 * Default Constructor
	 */
	public PalmTree() {
		category = "Plant";
		terraObject = "Palm Tree";
	}
	
	/**
	 * @override
	 * @return objImpScore
	 */
	public int getObjImpScore() {
		return objImpScore;
	}

  public String toString(){
    return "I am a palm tree " + getObjImpScore();
  }

}
