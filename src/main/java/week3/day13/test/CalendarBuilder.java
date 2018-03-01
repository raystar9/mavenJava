package week3.day13.test;

import java.util.Calendar;

public class CalendarBuilder {
	
	static int[][] build(Calendar calendar) {
		int[][] array = new int[6][7];
		int startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int endDate;
		int date;
		
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		endDate = calendar.get(Calendar.DAY_OF_MONTH);
		
		for(int j = 0; j < 6; j++) {
			for(int i = 0; i < 7; i++) {
				date = (j * 7 +i - startDayOfWeek + 2);
				if(j == 0) {
					if(i >= startDayOfWeek -1) {
						array[j][i] = date;
					} else {
						array[j][i] = -1;
					} 
				} else {
					if(date <= endDate) {
						array[j][i] = date;
					} else {
						array[j][i] = -1;
					}
				}
			}
		}
		return array;
	}
}
