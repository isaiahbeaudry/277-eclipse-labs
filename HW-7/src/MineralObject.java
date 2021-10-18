/**
 * MineralObject.java creates different types of mineral objects using getObject
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class MineralObject extends TerraObject {
	TerraObject objClass;

	/**
	 * Mineral getObject method.
	 * 
	 * @param type
	 * @return objClass
	 */
	public TerraObject getObject(String type) 
  {
		if(type.equals("Coal")) 
			objClass = new Coal();

		else if(type.equals("Diamond"))
			objClass = new Diamond();

		else if(type.equals("Gold"))
			objClass = new Gold();

		else if(type.equals("Iron"))
			objClass = new Iron();
      
		return objClass;
	}
}
