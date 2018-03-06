package week5.day19.practice._02_printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class WriteMain {

	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(resourceAddress + "output.txt"))){
			String str = "The little prince";
			char[] arr = {'T', 'h','e',' ',	'l','i','t','t','l','e',' ','p','r','i','n','c','e'};
			
			writer.println(str);
			writer.println(arr);
			System.out.println("write file.");
		} catch (IOException e) {
			System.out.println("Cannot write.");
		}
	}

}
