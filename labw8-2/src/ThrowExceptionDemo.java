import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author isaiahbeaudry
 *
 */
public class ThrowExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int intArray[] = new int[5];
		boolean flag = true;
		int index = 0;
		int b = 0;

		while (flag) {
			try {
				int a = 5 / b;

				if (index < intArray.length) {
					int input = getInt();
					intArray[index] = input;
					System.out.println(intArray[index]);
					index++;
				}

				else {
					flag = false;
					System.out.println(intArray[5]);
				}
			} catch (InputMismatchException input) {
				System.out.println("Please enter an integer! ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("There is no 5th index in array! ");
			} catch (ArithmeticException e) {
				b = 1;
			}
		}
		System.out.println("End the program!");
	} // end main

	/**
	 * getInt method
	 * 
	 * @return next int of sc
	 * @throws FileNotFoundException
	 */
	public static int getInt() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer: ");
		return sc.nextInt();
	} // end getInt()
}
