/**
 * 
 */

/**
 * @author isaiahbeaudry
 *
 */
public class Creature {
	private int strength, agility, intelligence;
	private String creature;

	public Creature(String name) {
		this.creature = name;
	}

	public String getCreature() {
		return creature;
	}

	public int max() {
		return Math.max(strength, Math.max(agility, intelligence));
	}

	public int sum() {
		return strength + agility + intelligence;
	}

	public double average() {
		return sum() / 3.0;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public String toString() {
		return creature;
	}
}
