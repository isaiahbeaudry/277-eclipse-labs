import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LabDriver {

	public static void main(String[] args) {
		//Whenever we want to read or write, we need to tell Java where.
		File file = new File("mobysmall.txt");
		//A reader is like a magnifying glass. It can only look at one thing at a time.
		BufferedReader bread = null;
		//A writer is like a printer. It can only print one line at a time.
		BufferedWriter brWrite = null;

		//We put try brackets because the file might not be there, or the file might be corrupted.
		try {
			//We create a file reader. This will shout out what it's reading for us to use as we desire.
			FileReader fr = new FileReader(file);
			//bread is a buffered reader. What this means is that it listens to what our FileReader shouts,
			//and holds onto it until it's a good time to give it to us. In multi-threaded projects, this is
			//important. Ours is a single thread, but it's still nice and polite about it.
			bread = new BufferedReader(fr);
			//Just like with the reader, we need to tell java where to write.
			File fileW = new File("mobybig.txt");
			//We can turn the creation of a BufferedWriter into a single line with this syntax.
			//new FileWriter returns a FileWriter. We could store this in a FileWriter object,
			//but it is not necessary. So we put it into one line like so:
			brWrite = new BufferedWriter(new FileWriter(fileW));

			//Here's where we will store ever line that we read for later use.
			String line;

			//While we're not at the end of the file (In other words, while we're still getting input)
			//we read a line from our input file into our "line" string.
			while ((line = bread.readLine()) != null) {
				//Convert the line into upper case.
				line = line.toUpperCase();
				//Print it out to the console for debug purposes
				System.out.println(line); //This line is not necessary, I just put it in.
				//Write our line to the file
				brWrite.write(line);
				//We also need to write a linebreak, otherwise it'll all be one giant line.
				brWrite.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		} finally {
			try {
				bread.close();
				brWrite.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// File was probably never opened!
			}
		}
	}
}
