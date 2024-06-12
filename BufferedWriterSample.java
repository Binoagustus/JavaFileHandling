package day_two_samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
			bw.write("Hello, World!");
			bw.newLine();
			bw.write("BufferedWriter Example");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
