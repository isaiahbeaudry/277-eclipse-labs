import java.util.Queue;
import java.util.LinkedList;;

/**
 * 
 * @author Isaiah Beaudry, Dimpal Shah, Vraj Dalsania
 *
 */
public class Main {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		Queue<String> commandQueue = new LinkedList<>();
		MiniWP miniWP = new MiniWP("Intial Contents");

		commandQueue.add("Insert J");
		commandQueue.add("Insert K");
		commandQueue.add("Insert L");
		commandQueue.add("Move left");
		commandQueue.add("Move right");
		commandQueue.add("Move left");
		commandQueue.add("Move left");
		commandQueue.add("Search K");

		System.out.println("Initial: " + miniWP.toStringCursor());

		while (!commandQueue.isEmpty()) {

			try {
				miniWP.processCommand(commandQueue.poll());
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}

		}
	}
}
