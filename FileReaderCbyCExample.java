package day_two_samples;

import java.io.FileReader;

public class FileReaderCbyCExample {
	
	public static void main(String[] args) throws Exception {

		// Create a FileReader object to read the file
		FileReader fr = new FileReader("myfile.txt");

		// Read the file character by character
		int c;
		while ((c = fr.read()) != -1) {

			// Print the character to the console
			System.out.print((char) c);
		}

		// Close the FileReader object
		fr.close();
	}
}
