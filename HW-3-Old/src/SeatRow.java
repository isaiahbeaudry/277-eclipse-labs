import java.util.*;

@SuppressWarnings("unused") // Suppress unused java packages

/**
 * This is our SeatRow class that displays our rows of seats.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Mar. 3 2021)
 */
public class SeatRow {

	public boolean[] seats;

	/**
	 * Default constructor
	 * 
	 * @param cls
	 */
	public SeatRow(String cls) {
		if (cls.equals("e")) {
			seats = new boolean[] { false, false, false, false, false, false };
		} else {
			seats = new boolean[] { false, false, false, false };
		}
	}

	/**
	 * @override toString
	 */
	public String toString() {
		String output = "";
		if (seats.length == 4) {
			Character[] output2 = new Character[] { 1, 2, 3, 4 };
			for (int i = 0; i < seats.length; i++) {
				if (seats[i])
					output2[i] = '*';
				else
					output2[i] = '.';
			}

			output = output2[0] + " " + output2[1] + " " + output2[2] + " " + output2[3];
		}

		else if (seats.length == 6) {
			Character[] output2 = new Character[] { 1, 2, 3, 4, 5, 6 };
			for (int i = 0; i < seats.length; i++) {
				if (seats[i])
					output2[i] = '*';
				else
					output2[i] = '.';
			}
			output = output2[0].toString() + output2[1] + output2[2] + " " + output2[3] + output2[4] + output2[5];
		}
		return output;
	}

	/**
	 * fillSeats method
	 * 
	 * @param startIndex
	 * @param quantity
	 */
	public void fillSeats(int startIndex, int quantity) {
		for (int i = startIndex; i < startIndex + quantity; i++)
			seats[i] = true;
	}
}