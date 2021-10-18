
public class Car {
	void fastCheck(int speed) throws MyException {
		if (speed > 100) {
			throw new MyException("\nYou are driving too fast, slow down.");
		}
	}
	
	void slowCheck(int speed) throws MyException {
		if (speed < 50) {
			throw new MyException("\nYou are driving too slow, speed up.");
		}
	}
	
	void trouble() throws Exception {
		System.out.println("\nI just want to cause trouble...");
		throw new MyException();
	}
	
	void crash(double speed) throws Exception {
		if (speed <= 0) {
			System.out.println("\nYour speed doesn't exist...");
			throw new ArithmeticException();
		}
	}
}