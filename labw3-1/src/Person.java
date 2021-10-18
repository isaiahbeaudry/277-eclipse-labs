
public class Person {
	private String name;
	private int age;
	
	/*
	 * Default Constructor
	 */
	public Person() {
		name = "new born";
		age = 0;
	}
	
	/*
	 * Overridden Constructor
	 */
	public Person(String iname, int iage) {
		name = iname;
		age = iage;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String iname) {
		name = iname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	* @Override
	*/
	public String toString() {
		return "Person [name= " + name + ", age= " + age + "]";
	}
	
}
