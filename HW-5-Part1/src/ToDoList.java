import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * @author Isaiah Beaudry, Dimpal Shah, Vraj Dalsania
 *
 */
public class ToDoList {
	PriorityQueue<Task> task;

	public ToDoList() {
		task = new PriorityQueue<Task>();
	}

	/**
	 * addTask method
	 * 
	 * @param string
	 */
	public void addTask(String string) {
		Scanner scan = new Scanner(string);
		String instruct = "";
		int i = 0;
		String pd = "";
		try {
			instruct = scan.next();
			i = scan.nextInt();
			pd = scan.nextLine().trim();
			Task t = new Task(i, pd);
			boolean check = true;
			for (Task obj : task) {
				if (t.equals(obj)) {
					System.out.println("Same task is already added");
					System.out.println("Hashcode of task trying to be added: " + t.hashCode());
					System.out.println("Hashcode of task already in queue: " + obj.hashCode());
					check = false;
				}
			}
			if (check) {
				task.add(t);
			}
		} catch (InputMismatchException e) {
			System.out.println("The priority must be an integer between 1 and 9");
		}
	}

	/**
	 * nextTask method
	 */
	public void nextTask() {
		if (task.size() != 0) {
			System.out.println(task.poll());
		} else {
			System.out.println("There are no tasks in the list.");
		}
	}
}
