package week5.day19.practice._01_bufferedWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteMain {

	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourceAddress + "output.txt"))){
			char[] arr = {'T', 'h','e',' ',	'l','i','t','t','l','e',' ','p','r','i','n','c','e'};

			for(int i = 0; i < arr.length; i++) {
				writer.write(arr[i]);
			}
			writer.write('\n');
			System.out.println("write file.");
		} catch (IOException e) {
			System.out.println("Cannot write.");
		}
	}

}
