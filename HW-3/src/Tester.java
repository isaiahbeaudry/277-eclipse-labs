import java.util.*;

/**
 * This is our Main class that is our driver.
 * 
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Mar. 3 2021)
 */
public class Tester {
	public static void main(String[] args) {

		Scanner choice = new Scanner(System.in);
		String userChoice = "";
		int numOfPassenger = 0;

		Airplane airplane1 = new Airplane();
		ArrayList<boolean[]> firstClass = airplane1.firstClass();
		ArrayList<boolean[]> economyClass = airplane1.economyClass();

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
						System.out.println("That's not is not a number!");
						System.out.println("Passengers? (1-2)");
						choice.next();
					}

					numOfPassenger = choice.nextInt();
					do {
						if (numOfPassenger == 1 || numOfPassenger == 2) {
							break;
						}
						System.out.println("That's not is not a choice!");
						System.out.println("Passengers? (1-2)");
						numOfPassenger = choice.nextInt();
					} while (numOfPassenger < 1 && numOfPassenger > 2);

					System.out.println("A)isle W)indow");
					while (!choice.hasNext("[a,w]")) {
						System.out.println("That's not is not a choice!");
						System.out.println("A)isle W)indow");
						choice.next();
					}

					userChoice = choice.next();

					if (userChoice.equals("a")) {
						if (airplane1.ailseFCfull(firstClass) == true) { // checks if all aisle seats are booked
							System.out.println("Sorry, all the aisle seats for first class are booked!");
						} else {
							while (numOfPassenger != 0) {
								airplane1.findFCSeat(firstClass, "a");
								numOfPassenger -= 1;
							}
						}
					} else {
						if (airplane1.windowFCfull(firstClass) == true) { // checks if all window seats are booked
							System.out.println("Sorry, all the window seats for first class are booked!");
						} else {
							while (numOfPassenger != 0) {
								airplane1.findFCSeat(firstClass, "w");
								numOfPassenger -= 1;
							}
						}
					}

				} else if (userChoice.equals("e")) {
					System.out.println("Passengers? (1-3)");
					while (!choice.hasNextInt()) {
						System.out.println("That's not is not a number!");
						System.out.println("Passengers? (1-3)");
						choice.next();
					}

					numOfPassenger = choice.nextInt();
					do {
						if (numOfPassenger == 1 || numOfPassenger == 2 || numOfPassenger == 3) {
							break;
						}
						System.out.println("That's not is not a choice!");
						System.out.println("Passengers? (1-3)");
						numOfPassenger = choice.nextInt();
					} while (numOfPassenger < 1 && numOfPassenger > 3);

					System.out.println("A)isle C)enter W)indow");
					while (!choice.hasNext("[a,c,w]")) {
						System.out.println("That's not is not a choice!");
						System.out.println("A)isle C)enter W)indow");
						choice.next();
					}

					userChoice = choice.next();

					if (userChoice.equals("a")) {
						if (airplane1.ailseECfull(economyClass) == true) { // checks if all aisle seats are booked
							System.out.println("Sorry, all the economy seats for economy class are booked!");
						} else {
							while (numOfPassenger != 0) {
								airplane1.findECSeat(economyClass, "a");
								numOfPassenger -= 1;
							}
						}
					} else if (userChoice.equals("c")) {
						if (airplane1.centerECfull(economyClass) == true) { // checks if all center seats are booked
							System.out.println("Sorry, all the center seats for economy class are booked!");
						} else {
							while (numOfPassenger != 0) {
								airplane1.findECSeat(economyClass, "c");
								numOfPassenger -= 1;
							}
						}
					} else {
						if (airplane1.windowECfull(economyClass) == true) { // checks if all window seats are booked
							System.out.println("Sorry, all the window seats for economy class are booked!");
						} else {
							while (numOfPassenger != 0) {
								airplane1.findECSeat(economyClass, "w");
								numOfPassenger -= 1;
							}
						}
					}

				}
			}

			else if (userChoice.equals("s")) {
				for (int i = 0; i < firstClass.size(); i++) {
					System.out.println(airplane1.Fout(firstClass.get(i)));
				}
				for (int i = 0; i < economyClass.size(); i++) {
					System.out.println(airplane1.Eout(economyClass.get(i)));
				}

			}
		} while (!userChoice.equals("q"));

		choice.close(); // close scanner
	}
}