package week3.day13.exam._02_exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain2 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");

			System.out.println();
			reader.close();
		} /*
			 * catch (FileNotFoundException e) { System.out.println("file not found");
			 * //FileNotFoundException is subclass of IOException. }
			 */ catch (IOException e) {
			System.out.println("IO error occurred");
		}

	}

}
