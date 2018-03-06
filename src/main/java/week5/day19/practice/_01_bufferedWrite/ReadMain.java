package week5.day19.practice._01_bufferedWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		int in;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(resourceAddress + "output.txt"))){
			
			while((in = reader.read()) != -1) {
				System.out.print((char)in);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
