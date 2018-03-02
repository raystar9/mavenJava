package week4.day17.practice._10_timesTable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class TimesTableReader {

	public static void main(String[] args) {
		FileReader reader = null;
		int c;
		
		try {
			reader = new FileReader(TimesTableWriter.resourceAddress + "timesTable.txt");
			while(true) {
				c =  reader.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Cannot read a file");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error occured on close.");
			}
		}

	}

}
