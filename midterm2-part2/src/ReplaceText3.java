import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText3 {
	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Error, invalid command-line arguements passed.");
		} else {
			String inputF = args[0];
			String outputF = args[1];
			String inputW = args[2];
			String outputW = args[3];
			File file = new File(inputF);
			if (file.exists()) {
				try {
					Scanner sc = new Scanner(file);
					PrintWriter pw = new PrintWriter(outputF);
					while (sc.hasNextLine()) {
						String line = sc.nextLine();
						line = line.replaceAll(inputW, outputW);
						pw.write(line + "\n");
					}
					pw.flush();
					pw.close();
					sc.close();
					System.out.println("File has been generated with replaced word");
				} catch (IOException e) {
					System.out.println("Exception Occured while processing");
				}
			} else {
				System.out.println("Input file " + inputF + " does not exist");
			}
		}

	}
}