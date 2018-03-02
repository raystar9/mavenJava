package week4.day17.practice._08_writeFile;

import java.io.FileWriter;
import java.io.IOException;

class WriteMain {

	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		FileWriter writer = null;
		
		try {
			char[] arr = {'T', 'h','e',' ',	'l','i','t','t','l','e',' ','p','r','i','n','c','e'};
			writer = new FileWriter(resourceAddress + "output.txt");
			
			
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
