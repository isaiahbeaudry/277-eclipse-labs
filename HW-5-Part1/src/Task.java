import java.util.Objects;

/**
 * 
 * @author Isaiah Beaudry, Dimpal Shah, Vraj Dalsania
 *
 */
public class Task implements Comparable<Task> {
	public int priority;
	public String description;

	/**
	 * Constructor
	 * 
	 * @param priority
	 * @param descrption
	 */
	public Task(int priority, String descrption) {
		this.priority = priority;
		this.description = descrption;
	}

	/**
	 * @return
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @override toString
	 */
	public String toString() {
		return description;
	}

	/**
	 * @override compareTo
	 */
	public int compareTo(Task task) {
		if (this.getPriority() > task.getPriority()) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * @Override hashCode
	 */
	public int hashCode() {
		int hash = 7;
		hash = 41 * hash + Objects.hashCode(this.description);
		return hash;
	}

	/**
	 * @Override equals
	 */
	public boolean equals(Object t) {
		if (t == null) {
			return false;
		}
		if (t instanceof Task) {
			Task t1 = (Task) t;
			if (((Task) t).description.toLowerCase().equals(this.description.toLowerCase())) {
				return true;
			}
		}

		return false;
	}
}
