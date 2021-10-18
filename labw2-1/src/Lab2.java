import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("We are going to create a menu");
		System.out.println("Practice data entry validation");
		System.out.println("Practice Concatenation");
		Scanner keyboard = new Scanner(System.in);
		int num = 0;// example validation //= CheckInput.getInt();
// Display the menu and get the menu option
		while (true) {
			System.out.println("Lab2\t Please select from the following");
			System.out.println("1. Get an integer value");
			System.out.println("2. Get integer in a range");
			System.out.println("3. Get a real value");
			System.out.println("4. Get a positive integer");
			System.out.println("5. Get String");
			num = CheckInput.getIntRange(1,5);
			System.out.println("You chose " + num);
			switch(num) {
			case 1:
				System.out.print("Give me an integer:\n>");
				System.out.println("Menu option " + num + ": " + CheckInput.getInt());
				break;
			case 2:
				System.out.print("Give me an integer between 1 and 10:\n>");
				int lCheck = CheckInput.getIntRange(1, 10);
				System.out.println("Menu option " + num + ": " + lCheck);
				break;
			case 3:
				System.out.print("Give me a real value:\n>");
				System.out.println("Menu option " + num + ": " + CheckInput.getDouble());
				break;
			case 4:
				System.out.print("Give me a positive integer:\n>");
				System.out.println("Menu option " + num + ": " + CheckInput.getPositiveInt());
				break;
			default:
				System.out.print("Give me a string\n>");
				System.out.println("Menu option " + num + ": " + CheckInput.getString());
				break;
			}

//When you finish executing your menu ask the user if they want to run the code
//again, validate and based on the answer chose to repeat the code or not
			System.out.println("Again? yes, or no only");
			System.out.print(">");
			if (CheckInput.getYesNo()) {
				continue;
			} else {// When done
				break;
			}
		}
		System.out.println("Good Bye!");
	}// main
}// class