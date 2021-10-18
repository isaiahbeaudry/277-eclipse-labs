import java.util.*;

/**
 * This is a Airplane class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Mar. 3 2021)
 */
public class Airplane {

	private int numOfFCR; // num of first class rows
	private int numOfFCS;// num of first class seats per row
	private int numOfECR;// num of economy class rows
	private int numOfECS;// num of economy class seats per row

	/**
	 * Default constructor
	 */
	public Airplane() {
		this.numOfFCR = 0;
		this.numOfFCS = 0;
		this.numOfECR = 0;
		this.numOfECS = 0;
	}

	/**
	 * Overloaded Constructor
	 * 
	 * @param FCR
	 * @param FCS
	 * @param ECR
	 * @param ECS
	 */
	public Airplane(int FCR, int FCS, int ECR, int ECS) {
		this.numOfFCR = FCR;
		this.numOfFCS = FCS;
		this.numOfECR = ECR;
		this.numOfECS = ECS;
	}

	/**
	 * First Class Seats get method
	 * 
	 * @return numOfFCS
	 */
	public int getFCS() {
		return numOfFCS;
	}

	/**
	 * First Class Rows
	 * 
	 * @return numOfFCR
	 */
	public int getFCR() {
		return numOfFCR;
	}

	/**
	 * Economy Class Seats get method
	 * 
	 * @return numOfECS
	 */
	public int getECS() {
		return numOfECS;
	}

	/**
	 * Economy Class Rows get method
	 * 
	 * @return numOfECR
	 */
	public int getECR() {
		return numOfECR;
	}

	/**
	 * Sets up one row of first class
	 * 
	 * @return fRow
	 */
	public ArrayList<String> firstClassRows() {
		ArrayList<String> fRow = new ArrayList<String>();
		int counter = numOfFCS;
		while (counter != 0) {
			fRow.add(".");
			counter -= 1;
		}
		return fRow;
	}

	/**
	 * Calls firstClassRows() to form many rows
	 * 
	 * @return firstClass
	 */
	public ArrayList<ArrayList<String>> firstClass() {
		// an arrayList of arraylists, contains the arraylist of all the rows in first
		// class
		ArrayList<ArrayList<String>> firstClass = new ArrayList<ArrayList<String>>();
		int counter = numOfFCR;
		while (counter != 0) {
			ArrayList<String> rows = firstClassRows();
			firstClass.add(rows);
			counter -= 1;
		}
		return firstClass;
	}

	/**
	 * Sets up one economy class row
	 * 
	 * @return eRow
	 */
	public ArrayList<String> economyClassRows() {
		ArrayList<String> eRow = new ArrayList<String>();
		int counter = numOfECS;
		while (counter != 0) {
			eRow.add(".");
			counter -= 1;
		}
		return eRow;
	}

	/**
	 * Calls up economyClassRows() to form many rows
	 * 
	 * @return economyClass
	 */
	public ArrayList<ArrayList<String>> economyClass() {
		// an arrayList of arraylists, contains the arraylist of all the rows in economy
		// class
		ArrayList<ArrayList<String>> economyClass = new ArrayList<ArrayList<String>>();
		int counter = numOfECR;
		while (counter != 0) {
			ArrayList<String> rows = economyClassRows();
			economyClass.add(rows);
			counter -= 1;
		}
		return economyClass;
	}
}