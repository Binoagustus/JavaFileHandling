package day_two_samples;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\Projects\\JavaTraining\\testdata\\sample1.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
