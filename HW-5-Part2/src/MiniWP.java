import java.util.ListIterator;

/**
 * 
 * @author Isaiah Beaudry, Dimpal Shah, Vraj Dalsania
 *
 */
public class MiniWP implements MiniWPI {

	private String initialString;

	/**
	 * MiniWP Constructor
	 */
	public MiniWP() {
		initialString = "";
	}

	/**
	 * MiniWP Overloaded Constructor
	 * 
	 * @param initialString
	 */
	public MiniWP(String initialString) {

		this.initialString = initialString;
		for (int i = 0; i < this.initialString.length(); ++i) {
			left.push(initialString.charAt(i));
		}
	}

	/**
	 * Is cursor at the start of the text
	 */
	public boolean isAtStart() {
		return left.empty();
	}

	/**
	 * Is cursor at the end of the text
	 */
	public boolean isAtEnd() {
		return right.empty();
	}

	/**
	 * Insert c into the string at the cursor
	 */
	public void insertChar(char c) {
		left.push(c);
	}

	/**
	 * Move cursor left 1 character. If we're already at the start of the string, do
	 * nothing
	 */
	public void moveLeft() {
		right.push(left.pop());
	}

	/**
	 * Move cursor right 1 character. If we're already at the end of the string, do
	 * nothing
	 */
	public void moveRight() {
		left.push(right.pop());
	}

	/**
	 * Delete character before the cursor. If there is none, do nothing
	 */
	public void backspace() {
		left.pop();
	}

	/**
	 * Delete character after the cursor. If there is none, do nothing
	 */
	public void delete() {
		right.pop();
	}

	/**
	 * Move cursor to start of the text
	 */
	public void moveToStart() {
		while (!left.empty()) {
			right.push(left.pop());
		}
	}

	/**
	 * Move cursor to end of the text
	 */
	public void moveToEnd() {
		while (!right.empty()) {
			left.push(right.pop());
		}
	}

	/**
	 * @override toString Convert to string. The cursor position is ignored
	 */
	public String toString() {
		String res = left + " ";

		ListIterator li = right.listIterator(right.size());

		if (right.empty()) {
			return res + right;
		}

		res += "[" + li.previous();

		// Iterate in reverse.
		while (li.hasPrevious()) {
			res += ", " + li.previous();
		}

		return res + "]";
	}

	/**
	 * @override toStringCursor Like toString, but the special character | is
	 *           included to mark the cursor position
	 */
	public String toStringCursor() {
		String res = left + " | ";

		ListIterator li = right.listIterator(right.size());

		if (right.empty()) {
			return res + right;
		}

		res += "[" + li.previous();

		// Iterate in reverse.
		while (li.hasPrevious()) {
			res += ", " + li.previous();
		}

		return res + "]";
	}

	/**
	 * Search forward for the next occurrence of c that starts at the cursor or
	 * later. If found, leave the cursor immediately after that occurrence and
	 * return true. Else, leave the cursor at the end of the text and return false
	 */
	public boolean search(char c) {
		int inLeft = left.search(c);
		int inRight = right.search(c);

		if (inLeft == -1 && inRight == -1) {
			return false;
		}

		if (inLeft != -1) {
			while (left.peek() != c) {
				right.push(left.pop());
			}
		}

		// cursor is always being placed to right of found char
		else if (inRight != -1) {
			while (left.peek() != c) {
				left.push(right.pop());
			}
		}

		return true;
	}

	/**
	 * Method that reads in the string that was retrieved from the top of the Queue
	 * and executes the appropriate command. It also calls a method to print out the
	 * command just executed and the resulting stacks
	 */
	public void processCommand(String s) throws IllegalArgumentException {

		String[] cmd = s.trim().split(" ");

		if (cmd.length > 2 || cmd.length < 1) {
			throw new IllegalArgumentException("Invalid format of command found!");
		}

		cmd[0] = cmd[0].toLowerCase();

		switch (cmd[0]) {
		case "insert": {

			if (cmd.length == 1) {
				throw new IllegalArgumentException("Character to be inserted is not provided!");
			}
			if (cmd[1].length() > 1) {
				throw new IllegalArgumentException("Character to be inserted is InValid!");
			}

			insertChar(cmd[1].charAt(0));
			break;
		}

		case "move": {

			cmd[1] = cmd[1].toLowerCase();

			switch (cmd[1]) {
			case "left":
				moveLeft();
				;
				break;

			case "right":
				moveRight();
				;
				break;

			case "end":
				moveToEnd();
				break;

			case "start":
				moveToStart();
				break;

			default:
				throw new IllegalArgumentException("You can only move to either left or right!");
			}

			break;
		}

		case "search": {

			if (cmd.length == 1) {
				throw new IllegalArgumentException("Character to be searched is not provided!");
			}

			if (cmd[1].length() > 1) {
				throw new IllegalArgumentException("Character to be searched is InValid!");
			}

			search(cmd[1].charAt(0));

			break;
		}

		case "backspace": {
			if (cmd.length > 1) {
				throw new IllegalArgumentException("backpace instruction does accept any arguments!");
			}

			backspace();
			break;
		}

		case "delete": {
			if (cmd.length > 1) {
				throw new IllegalArgumentException("delete instruction does accept any arguments!");
			}

			delete();
			break;
		}

		default: {
			throw new IllegalArgumentException("Invalid Command provided!");
		}
		}

		printtest(s);
	}

	/**
	 * Method to print out a command and the results
	 */
	public void printtest(String s) {
		System.out.println(s + ": " + this.toStringCursor());
	}

}
