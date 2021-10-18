/**
 * This is our WaterObject class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class WaterObject extends TerraObject {
	TerraObject objClass;

	
	/**
	 * @param type
	 * @return objClass
	 */
	public TerraObject getObject(String type) {
		if(type.equals("River")) 
			objClass = new River();
		else if(type.equals("Lake"))
			objClass = new Lake();
		else if(type.equals("Ocean"))
			objClass = new Ocean();
		else if(type.equals("Pond"))
			objClass = new Pond();
		return objClass;
	}
	

	
	

}
