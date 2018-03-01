package week3.day13.test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar calendar;
		int[][] calendarArray;
		Scanner sc = new Scanner(System.in);
		
		int year = scanInt(sc, "input year : ");
		int month = scanInt(sc, "input month : ");
		
		sc.close();
		
		
		calendar = new GregorianCalendar(year, month -1, 1);
		calendarArray = CalendarBuilder.build(calendar);
		CalendarPrinter.print(calendarArray, year, month);
		
	}
	
	static int scanInt(Scanner sc, String str) {
		System.out.print(str);
		return sc.nextInt();
	}
}
