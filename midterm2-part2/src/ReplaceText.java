import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) {

		System.out.println("What file are you accessing?");
		Scanner inputF = new Scanner(System.in);
		String fileName = inputF.next();
		File file = new File(fileName);
		BufferedReader bRead = null;
		BufferedWriter brWrite = null;

		try {
			FileReader fr = new FileReader(file);

			bRead = new BufferedReader(fr);
			System.out.println("What is the name of the new file?");
			Scanner outputF = new Scanner(System.in);
			String newFile = outputF.next();
			File fileOut = new File(newFile);

			brWrite = new BufferedWriter(new FileWriter(fileOut));

			String line;

			while ((line = bRead.readLine()) != null) {
				line.replace("the", "abc");
				//System.out.println(line);
				brWrite.write(line);
				brWrite.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		} finally {
			try {
				bRead.close();
				brWrite.close();
				inputF.close();
				
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// File was probably never opened!
			}
		}
	}
}
