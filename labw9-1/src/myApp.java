/**
 * @author isaiahbeaudry
 *
 */
public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Weight o1 = new Weight();
		Car c1 = new Car();
		
		try {
			// dangerous instructions
			System.out.println("\nWill execute...");
			//o1.weightCheck(230);
			//c1.fastCheck(150);
			//c1.slowCheck(33);
			//c1.trouble();
			c1.crash(0);
			//int a = 4/0;
			//trouble();
			System.out.println("\nWill not execute...if exception is thrown");
		}
		// multiple catch
		// Order matters
//		catch (ArithmeticException e) {
//			System.out.println("\nI am throwing an Arithmetic tantrum...");
//			System.out.println(e.getMessage());
//		}
//		catch (OverWeight e) {
//			System.out.println("\nYou are perfect the way you are...");
//		}
		catch(Exception e) {
			System.out.println("\nI am throwing a tantrum...");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			System.out.println("\nThis is in Finally...");
		}
	}
	
	public static void trouble() throws Exception {
		System.out.println("\nI just want to cause trouble...");
		throw new OverWeight();
	}
}