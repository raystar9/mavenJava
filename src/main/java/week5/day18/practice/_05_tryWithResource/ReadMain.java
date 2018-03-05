package week5.day18.practice._05_tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadMain {

	static final String thisAddress = "src/main/java/week4/day17/practice/_06_readFile2/";
	static final String resourceAddress = "src/main/resources/";

	public static void main(String[] args) {

		char[] arr = new char[64];
		int number;

		try (FileReader reader = new FileReader(resourceAddress + "dream.txt");) {
			while (true) {
				number = reader.read(arr);

				if (number == -1) {
					System.out.println("Read end");
					break;
				}
				System.out.print(new String(arr, 0, number));
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
