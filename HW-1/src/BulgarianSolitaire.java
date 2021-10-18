import java.util.*;
/**
 * This is a BulgarianSolitaire class that asks for the user's
 * input for how many piles they want to divide 45 cards into.
 * It then subtracts cards from the initial piles until it has 
 * 9 piles of cards with totals 1 through 9.
 * @author Dimpal Shah, Vraj Dalsania, and Isaiah Beaudry
 * @version 1.0 (Feb. 3 2021)
 */
public class BulgarianSolitaire {
	
	public static void main(String[] args) 
	{
		int UserInput;
		int number = 0;
		int NumOfCards = 45;
		int Sum = 0;
		boolean keepGoing = true;
		
		ArrayList<Integer> Final = new ArrayList<Integer>();
		Final.add(1);
		Final.add(2);
		Final.add(3);
		Final.add(4);
		Final.add(5);
		Final.add(6);
		Final.add(7);
		Final.add(8);
		Final.add(9);
			
		do {
			System.out.println("Enter the number of initial piles in range 2 - 9");
			UserInput = CheckInput.getInt(); // Check if user input is valid
			if (UserInput < 2 || UserInput > 9) {
				System.out.println("Invalid input"); // Output if int is out of range
			}
		   } while(!((UserInput >= 2) && (UserInput <= 9)));
		
		ArrayList<Integer> Piles = new ArrayList<Integer>(UserInput);
		
		
		do {
			do { // Generate random card totals for initial piles
				number = (int) (NumOfCards * Math.random()) + 1;
			}while(!((number >= 1) && (number < (NumOfCards/2))));
			
			Piles.add(number);
			Sum = Sum + number;
			NumOfCards = NumOfCards - number;
			UserInput = UserInput - 1;
		}while(UserInput > 1);
			
		Piles.add(45 - Sum); // Add remaining cards in last pile
		System.out.println("The initial piles are:"); 
		System.out.println(Piles); // Outpput the piles
		
		do {
			Sum = 0; // Loop though piles to remove cards
			for (int counter = 0; counter < Piles.size(); counter++) {
				Piles.set(counter, (Piles.get(counter)-1));
				
				if(Piles.get(counter) == 0) {
					Piles.remove(Piles.get(counter));
					counter = counter - 1;
				}
			}
			for (int num : Piles) {
				Sum = Sum + num;
			}
			Piles.add(45 - Sum); // Add remaining cards in last pile
			System.out.println("The new piles are:");
			System.out.println(Piles);
			if(Piles.containsAll(Final)) { 
				keepGoing = false; // When cards are in piles of 1-9
			}
		}while(keepGoing);
	}
	
	/**
	* @Override
	*/
	public String toString() {
		return "This is our BulgarianSolitaire class.";
	} 
}