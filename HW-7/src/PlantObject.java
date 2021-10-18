/**
 * PlantObject.java creates different types of plant objects
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class PlantObject extends TerraObject{
	
	TerraObject objClass;
	
	/**
	 * Plant getObject method.
	 * 
	 * @param type
	 * @return objClass
	 */
	public TerraObject getObject(String type) {
		if(type.equals("Flower")) 
			objClass = new Flower();
		else if(type.equals("Grass"))
			objClass = new Grass();
		else if(type.equals("Palm Tree"))
			objClass = new PalmTree();
		else if(type.equals("Weeds"))
			objClass = new Weeds();
		return objClass;
	}

}
