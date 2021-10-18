/**
 * This is our abstract AnimalObject class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, Connor Koch, and Isaiah Beaudry
 * @version 1.0 (May 5 2021)
 */
public class AnimalObject extends TerraObject {
	TerraObject objClass;

	/**
	 * Animal getObject method.
	 * 
	 * @param type
	 * @return objClass
	 */
	public TerraObject getObject(String type) {
		if (type.equals("Dog"))
			objClass = new Dog();
		else if (type.equals("Bear"))
			objClass = new Bear();
		else if (type.equals("Monkey"))
			objClass = new Monkey();
		else if (type.equals("Tiger"))
			objClass = new Tiger();
		return objClass;
	}
}