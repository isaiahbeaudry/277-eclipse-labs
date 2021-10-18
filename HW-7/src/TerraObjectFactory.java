public class TerraObjectFactory {
	TerraObject objClass;
	
	public TerraObject getObject(String type) {
		if(type.equals("River")) 
			objClass = new River();
		else if(type.equals("Lake"))
			objClass = new Lake();
		else if(type.equals("Ocean"))
			objClass = new Ocean();
		else if(type.equals("Pond"))
			objClass = new Pond();
    else if(type.equals("Flower"))
			objClass = new Flower();
		else if(type.equals("Palm Tree"))
			objClass = new PalmTree();
		else if(type.equals("Grass"))
			objClass = new Grass();
		else if(type.equals("Weeds"))
			objClass = new Weeds();
    else if(type.equals("Coal")) 
			objClass = new Coal();
		else if(type.equals("Diamond"))
			objClass = new Diamond();
		else if(type.equals("Gold"))
			objClass = new Gold();
		else if(type.equals("Iron"))
			objClass = new Iron();
    else if(type.equals("Dog"))
			objClass = new Dog();
		else if(type.equals("Tiger"))
			objClass = new Tiger();
		else if(type.equals("Bear"))
			objClass = new Bear();
		else if(type.equals("Monkey"))
			objClass = new Monkey();
		return objClass;
	}

}
