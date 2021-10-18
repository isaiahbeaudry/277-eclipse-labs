/**
 * The tester is good, except the show choice, the show choice works but doesn't update, but I am not sure if that is because 
 * of the seat class not working properly or just cause the show choice is not working properly
 * I think that it is most probably because of the seat class, so we can work on fixing the seat class first and then worry about
 * the show choice
 */
import java.util.*;

/**
 * This is our Main class that is our driver.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Mar. 3 2021)
 */
public class Main {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Make sure num of seats in each class is always even
		Airplane a1 = new Airplane(5, 4, 15, 6); // first class rows, first class seats, economy class rows, economy
													// class seats

		Scanner choice = new Scanner(System.in);
		String userChoice = "";
		int numOfPassenger = 0;
		// do while user hasn't quit
		do {
			System.out.println("A)dd S)how Q)uit");
			while (!choice.hasNext("[a,s,q]")) {
				System.out.println("That's not is not a choice!");
				System.out.println("A)dd S)how Q)uit");
				choice.next();
			}

			userChoice = choice.next();

			if (userChoice.equals("a")) {
				System.out.println("F)irst E)conomy");
				while (!choice.hasNext("[f,e]")) {
					System.out.println("That's not is not a choice!");
					System.out.println("F)irst E)conomy");
					choice.next();
				}

				userChoice = choice.next();

				if (userChoice.equals("f")) {
					System.out.println("Passengers? (1-2)");
					while (!choice.hasNextInt()) {
						int choice1 = choice.nextInt();
						while (choice1 != 1 || choice1 != 2) {
							System.out.println("That's not is not a choice!");
							System.out.println("Passengers? (1-2)");
							choice.nextInt();
						}
					}

					numOfPassenger = choice.nextInt();

					System.out.println("A)isle W)indow");
					while (!choice.hasNext("[a,w]")) {
						System.out.println("That's not is not a choice!");
						System.out.println("A)isle W)indow");
						choice.next();
					}

					userChoice = choice.next();

					if (userChoice.equals("w")) {
						do {
							Seat seat1 = new Seat(userChoice);
							seat1.assignSeat(a1.firstClass(), seat1.getType());
							numOfPassenger -= 1;
						} while (numOfPassenger != 0);
						// fcChange = true;
						System.out.println(a1.firstClass());
					}

				}
			}
			// the show choice works but I don't think it gets updated with the new list
			// after going through the seat class
			// I am not really sure why
			else if (userChoice.equals("s")) {
				ArrayList<ArrayList<String>> firstClassRows = a1.firstClass();
				ArrayList<ArrayList<String>> economyClassRows = a1.economyClass();
				for (int counter = 0; counter < firstClassRows.size(); counter++) {
					System.out.println("");
					System.out.print((counter + 1) + ") ");
					for (int counter2 = 0; counter2 < firstClassRows.get(counter).size(); counter2++) {
						System.out.print(firstClassRows.get(counter).get(counter2) + " ");
					}
				}
				int num = a1.getFCR();
				for (int counter = 0; counter < economyClassRows.size(); counter++) {
					int aisle = 0;
					System.out.println("");
					System.out.print((num + 1) + ") ");
					for (int counter2 = 0; counter2 < economyClassRows.get(counter).size(); counter2++) {
						if (aisle == (a1.getECS() / 2)) {
							System.out.print(" ");
						}
						System.out.print(economyClassRows.get(counter).get(counter2));
						aisle += 1;
					}
					num += 1;
				}
				System.out.println("");
			}
		} while (!userChoice.equals("q"));

		choice.close(); // close scanner
	}

}
