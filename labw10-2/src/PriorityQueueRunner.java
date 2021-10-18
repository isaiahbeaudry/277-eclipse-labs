import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * 
 * @author Isaiah Beaudry, Nathaniel Ventura, Tien Nguyen, Tony Guirguis
 *
 */
public class PriorityQueueRunner {
	
	public static void main(String[] args) {
		
		Queue<Person> myQueue = new PriorityQueue<Person>();
		
		Person p1 = new Person("Sam", "Smith");
		Person p2 = new Person("Charlie", "Black");
		Person p3 = new Person("Betty", "Brown");
		Person p4 = new Person("Jessica", "Stewart");
		Person p5 = new Person("John", "Friday");
		Person p6 = new Person("Frank", "Foley");
		
		myQueue.add(p1);
		myQueue.add(p2);
		myQueue.add(p3);
		myQueue.add(p4);
		myQueue.add(p5);
		myQueue.add(p6);
		
		@SuppressWarnings("rawtypes")
		Iterator iteratorVal = myQueue.iterator();
		
		while (iteratorVal.hasNext()) {
			System.out.println(iteratorVal.next());
		}

		System.out.println("\nPolling the Queue:\n");
		
		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
	}
}