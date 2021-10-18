import java.util.*;

/**
 * This is a Airplane class.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Mar. 3 2021)
 */
public class Airplane {

	public boolean[] seats;
	public boolean[] seats2;

	/**
	 * Returns Economy rows
	 * 
	 * @return seats, the seats in one row of economy class
	 */
	public boolean[] seatERow() {
		seats = new boolean[] { false, false, false, false, false, false };

		return seats;
	}

	/**
	 * Returns First Class rows
	 * 
	 * @return seats2, the seats in one row of first class
	 */
	public boolean[] seatFRow() {
		seats2 = new boolean[] { false, false, false, false };

		return seats2;

	}

	/**
	 * Find First Class seat
	 * 
	 * @param classList
	 * @param type      finds either a window or aisle seat in first class by index
	 */
	public void findFCSeat(ArrayList<boolean[]> classList, String type) {
		boolean seatFound = false;
		if (type.equals("w")) {
			for (int i = 0; i < classList.size(); i++) {
				// do
				// {
				if (!classList.get(i)[0]) {
					seatFound = true;
					classList.get(i)[0] = true;
				} else if (!classList.get(i)[3]) {
					seatFound = true;
					classList.get(i)[3] = true;
				}
				// }while(!seatFound);

				if (seatFound) {
					break;
				}

			}

		}

		else if (type.equals("a")) {
			for (int i = 0; i < classList.size(); i++) {
				if (!classList.get(i)[1]) {
					seatFound = true;
					classList.get(i)[1] = true;
				} else if (!classList.get(i)[2]) {
					seatFound = true;
					classList.get(i)[2] = true;
				}
				// }while(!seatFound);

				if (seatFound) {
					break;
				}

			}

		}
	}

	/**
	 * Check if aisle in First Class is full
	 * 
	 * @param classList
	 * @return boolean of whether or not all aisle seats in first class are full
	 */
	public boolean ailseFCfull(ArrayList<boolean[]> classList) {
		int fullCount = 0;
		for (int i = 0; i < classList.size(); i++) {
			if (classList.get(i)[1] && classList.get(i)[2]) {
				fullCount += 1;
			}
		}
		if (fullCount == 5) {
			return true;
		} else
			return false;
	}

	/**
	 * Check if window in First Class is full
	 * 
	 * @param classList
	 * @return boolean of whether or not all window seats in first class are full
	 */
	public boolean windowFCfull(ArrayList<boolean[]> classList) {
		int fullCount = 0;
		for (int i = 0; i < classList.size(); i++) {
			if (classList.get(i)[0] && classList.get(i)[3]) {
				fullCount += 1;
			}
		}
		if (fullCount == 5) {
			return true;
		} else
			return false;
	}

	/**
	 * Check if aisle in Economy is full
	 * 
	 * @param classList
	 * @return boolean of whether or not all aisle seats in economy class are full
	 */
	public boolean ailseECfull(ArrayList<boolean[]> classList) {
		int fullCount = 0;
		for (int i = 0; i < classList.size(); i++) {
			if (classList.get(i)[2] && classList.get(i)[3]) {
				fullCount += 1;
			}
		}
		if (fullCount == 15) {
			return true;
		} else
			return false;
	}

	/**
	 * Check if center in Economy is full
	 * 
	 * @param classList
	 * @return boolean of whether or not all center seats in economy class are full
	 */
	public boolean centerECfull(ArrayList<boolean[]> classList) {
		int fullCount = 0;
		for (int i = 0; i < classList.size(); i++) {
			if (classList.get(i)[1] && classList.get(i)[4]) {
				fullCount += 1;
			}
		}
		if (fullCount == 15) {
			return true;
		} else
			return false;
	}

	/**
	 * Check if window in Economy is full
	 * 
	 * @param classList
	 * @return boolean of whether or not all window seats in economy class are full
	 */
	public boolean windowECfull(ArrayList<boolean[]> classList) {
		int fullCount = 0;
		for (int i = 0; i < classList.size(); i++) {
			if (classList.get(i)[0] && classList.get(i)[5]) {
				fullCount += 1;
			}
		}
		if (fullCount == 15) {
			return true;
		} else
			return false;
	}

	/**
	 * Find Economy seat
	 * 
	 * @param classList
	 * @param type      finds either a window or aisle or center seat in economy
	 *                  class by index
	 */
	public void findECSeat(ArrayList<boolean[]> classList, String type) {
		boolean seatFound = false;
		if (type.equals("w")) {
			for (int i = 0; i < classList.size(); i++) {
				// do
				// {
				if (!classList.get(i)[0]) {
					seatFound = true;
					classList.get(i)[0] = true;
				} else if (!classList.get(i)[5]) {
					seatFound = true;
					classList.get(i)[5] = true;
				}
				// }while(!seatFound);

				if (seatFound) {
					break;
				}

			}

		}

		else if (type.equals("c")) {
			for (int i = 0; i < classList.size(); i++) {
				if (!classList.get(i)[1]) {
					seatFound = true;
					classList.get(i)[1] = true;
				} else if (!classList.get(i)[4]) {
					seatFound = true;
					classList.get(i)[4] = true;
				}
				// }while(!seatFound);

				if (seatFound) {
					break;
				}

			}

		}

		else if (type.equals("a")) {
			for (int i = 0; i < classList.size(); i++) {
				if (!classList.get(i)[2]) {
					seatFound = true;
					classList.get(i)[2] = true;
				} else if (!classList.get(i)[3]) {
					seatFound = true;
					classList.get(i)[3] = true;
				}
				// }while(!seatFound);

				if (seatFound) {
					break;
				}

			}

		}
	}

	/**
	 * First class method
	 * 
	 * @return firstClass the arrayList of rows for first class
	 */
	public ArrayList<boolean[]> firstClass() {
		ArrayList<boolean[]> firstClass = new ArrayList<boolean[]>();
		int counter = 5;
		while (counter != 0) {
			boolean[] rows = seatFRow();
			firstClass.add(rows);
			counter -= 1;
		}
		return firstClass;
	}

	/**
	 * Economy method
	 * 
	 * @return economyClass the arrayList of rows for economy class
	 */
	public ArrayList<boolean[]> economyClass() {
		ArrayList<boolean[]> economyClass = new ArrayList<boolean[]>();
		int counter = 15;
		while (counter != 0) {
			boolean[] rows = seatERow();
			economyClass.add(rows);
			counter -= 1;
		}
		return economyClass;
	}

	/**
	 * Fout method
	 * 
	 * @param classList
	 * @return output each row of first class with "*" for booked and "." for not
	 *         booked
	 */
	public String Fout(boolean[] classList) {
		String output = "";
		Character[] output2 = new Character[] { 1, 2, 3, 4 };
		for (int j = 0; j < classList.length; j++) {

			if (classList[j]) {
				output2[j] = '*';
			}

			else {
				output2[j] = '.';
			}

		}
		output = "-> " + output2[0] + " " + output2[1] + " " + output2[2] + " " + output2[3];

		return output;
	}

	/**
	 * Eout method
	 * 
	 * @param classList
	 * @return output, each row of the economy class with "*" for booked and "." for
	 *         not booked
	 */
	public String Eout(boolean[] classList) {
		String output = "";
		Character[] output2 = new Character[] { 1, 2, 3, 4, 5, 6 };
		for (int j = 0; j < classList.length; j++) {

			if (classList[j]) {
				output2[j] = '*';
			}

			else {
				output2[j] = '.';
			}

		}
		output = "-> " + output2[0] + output2[1] + output2[2] + " " + output2[3] + output2[4] + output2[5];

		return output;
	}

	/**
	 * @override toString
	 * 
	 * @return default string
	 */
	public String toString() {
		String out = "";
		return out + Fout(seats2) + Eout(seats);
	}
}