import java.util.*;//needed for scanner and input exception

public class App {
	public static void main(String[] args) {
		System.out.println("In main");

		int[] lIntegers = new int[5];
		boolean lSuccess = false;
		while (!lSuccess) {
			try {
				for (int i = 0; i < lIntegers.length; i++) {
					lIntegers[i] = GetInt();
				}
				// Throws ArrayIndexOutOfBoundsException.
				//System.out.println("Integer at index 5: " + lIntegers[5]);
				//Throws ArithmeticException. You can't divide by 0.
				//System.out.println("Divison by 0: " + lIntegers[0] / 0);
				lSuccess = true;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Trying to access index 5 causes an exception! "
						+ "It tried to access an index that didn't exist. " + e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("We tried to divide by 0, but you can't do that. " + e.getMessage());
				System.out.println(lIntegers[0] / 1);
			} catch (NumberFormatException e) {
				System.out.println("The number given to us was not a valid integer. " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("The input given was not a valid integer. " + e.getMessage());
			}
		}

		//this will be executed even if exception has thrown
		System.out.println("Finished....");
	}

	static int GetInt() throws InputMismatchException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = in.nextInt();
		return a;
	}
}