package week4.day17.practice._07_readFile2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadMain {

	static final String thisAddress = "src/main/java/week4/day17/practice/_06_readFile2/";
	static final String resourceAddress = "src/main/resources/";

	public static void main(String[] args) {
		FileReader reader = null;
		char[] arr = new char[64];
		int number;

		try {
			reader = new FileReader(resourceAddress + "output.txt");
			while(true) {
				number = reader.read(arr);
				
				if(number == -1) {
					System.out.println("Read end");
					break;
				}
				System.out.print(new String(arr, 0, number));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (IOException e) {
			System.out.println("Cannot read the file");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("Error occurred on closing file");
				}
			}
		}
	}
}
