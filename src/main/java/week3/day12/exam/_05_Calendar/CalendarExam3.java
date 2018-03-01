package week3.day12.exam._05_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam3 {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();

//		c.set(2017, 3, 5);
		c.add(Calendar.DATE, 10);
		Today t = new Today();
		
		t.print(c);
		
		
		
		
	}
}
