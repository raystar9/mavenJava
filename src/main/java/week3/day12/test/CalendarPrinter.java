package week3.day12.test;

import java.util.Calendar;

public class CalendarPrinter {
	
	static void print(Calendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int endDate;
		int date;
		
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		endDate = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("\t\t\t%d. %d\n", year, month);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 7; i++) {
				date = (j * 7 +i - startDayOfWeek + 2);
				if(j == 0) {
					if(i >= startDayOfWeek -1) {
						System.out.print(date + "\t");
					} else {
					System.out.print("\t");
					} 
				} else {
					if(date <= endDate) {
						System.out.print(date + "\t");
					} else {
						System.out.println("\t");
					}
					
				}
			}
			System.out.println();
		}
	}
}
