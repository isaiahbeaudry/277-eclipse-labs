
public class Student {
	private double gpa;
	
	/*
	 * Default Constructor
	 */
	public Student() {
		gpa = 0;
	}
	
	/*
	 * Overridden Constructor
	 */
	public Student(double igpa) {
		gpa = igpa;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	/**
	* @Override
	*/
	public String toString() {
		return "Student [gpa= " + gpa + "]";
	}
	
}
