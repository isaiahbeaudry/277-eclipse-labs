/**
 * 
 */

/**
 * @author isaiahbeaudry
 *
 */
public class Student {

	int sid;
	String name;
	int age;
	
	/**
	 * Default Constructor
	 */
	public Student() {
		sid = 0;
		name = " ";
		age = 0;
	}
	
	/**
	 * Overloaded Constructor
	 */
	public Student(int iID, String iname, int iage) {
		this.sid = iID;
		this.name = iname;
		this.age = iage;
	}


}
