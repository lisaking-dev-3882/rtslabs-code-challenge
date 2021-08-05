package rtslabspackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("Main");

		Scanner sc = new Scanner(System.in);
		log.info("Please provide path to text file: " + "\n");
		String path = sc.nextLine();

		try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File(path), true))) {
			pw.print("\n" + "Hello World");
			pw.close();
			log.info("Success");

		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			log.info("No path to text file provided.");
		}
		sc.close();
	}
}
