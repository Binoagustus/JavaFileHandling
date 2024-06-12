package day_two_samples;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Projects\\JavaTraining\\testdata\\sample1.txt");
			myWriter.write("Files is getting written into sample1");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
