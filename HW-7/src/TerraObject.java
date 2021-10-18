public abstract class TerraObject {
	protected String category;
	protected String terraObject;
	int impactScore;
	
	public String getCategory() {
		return category;
	}
	
	public String getTerraOject() {
		return terraObject;
	}

  public int getImpactScore(){
    return impactScore;
  }
	
	public int Impact(int min, int max) {
		impactScore = (int) ((Math.random() * (max - min)) + min);
		return impactScore;
	}
	
	public abstract TerraObject getObject(String object);
	

}