package week5.day19.practice._02_printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;

class WriteMain2 {

	static final String resourceAddress = "src/main/resources/";
	public static void main(String[] args) {
		
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(resourceAddress + "output.txt"))){
			writer.println("      *** scoreTable ***      ");
			
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "Kim", 92, 87, 95, 91.3f);
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "Park", 100, 90, 88, 92.7f);
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "Choi", 75, 88, 85, 82.7f);
			
			writer.printf("1 : %1$tY/ %1$tm/ %1$td %1$tp %1$tH %n", new GregorianCalendar());
			writer.printf("2 : %1$ty/ %1$tm/ %1$td %1$tp %1$tH:%1$tI %n", new GregorianCalendar());
			writer.printf("3 : %1$tY/ %1$tB/ %1$td %1$tA %1$tp %1$tl:%1$tM:%1$tS %n", new GregorianCalendar());
			writer.printf("4 : %tD %n", new GregorianCalendar());
			writer.printf("5 : %tF %n", new GregorianCalendar());
			writer.printf("6 : %tF %n", new Date());
			writer.printf("7 : %tF %n", System.currentTimeMillis());
			
			System.out.println("write file.");
		} catch (IOException e) {
			System.out.println("Cannot write.");
		}
	}

}
