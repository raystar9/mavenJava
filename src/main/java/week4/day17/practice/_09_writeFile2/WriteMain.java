package week4.day17.practice._09_writeFile2;

import java.io.FileWriter;
import java.io.IOException;

class WriteMain {

	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		FileWriter writer = null;
		
		try {
			char[] arr = {'I', ' ','l','o',	'v','e',' ','y','o','u'};
			writer = new FileWriter(resourceAddress + "output.txt", true);
			
			writer.write(arr);
			writer.write('\n');
			System.out.println("write file.");
		} catch (IOException e) {
			System.out.println("Cannot write.");
		}
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
