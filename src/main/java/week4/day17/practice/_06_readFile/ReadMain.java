package week4.day17.practice._06_readFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadMain {
	
	static final String thisAddress = "src/main/java/week4/day17/practice/_06_readFile/";
	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		FileReader reader = null;
		int data;
		
		try {
			reader = new FileReader(resourceAddress + "poem.txt");
//			reader = new FileReader(thisAddress + "poem.txt");
			while (true) {
				data = reader.read();
				if (data == -1) {
					System.out.println();
					break;
				}
				char ch = (char) data;
				System.out.print(ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (IOException e) {
			System.out.println("Cannot read the file");
		}  finally {
			if(reader != null) {
				try {
					reader.close();
				} catch(IOException e) {
					System.out.println("Error occurred on closing file");
				}
			}
		}
	}
}
