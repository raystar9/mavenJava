package week4.day17.practice._10_timesTable;

import java.io.FileWriter;
import java.io.IOException;

class TimesTableWriter {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(resourceAddress + "timesTable.txt");
			for(int j = 0; j <= 9; j++) {
				for(int i = 2; i <= 9; i++) {
					if(j == 0) {
						writer.write("[" + i + "]\t");
					} else {
						writer.write(new String(i + "*" + j + "=" + i*j + "\t"));
					}
				}
				writer.write("\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
