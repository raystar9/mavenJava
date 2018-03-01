package week3.day12.test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar calendar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input year : ");
		String year = sc.nextLine();
		
		System.out.print("input month : ");
		String month = sc.nextLine();
		
		sc.close();
		
		calendar = new GregorianCalendar(Integer.valueOf(year), Integer.valueOf(month) -1, 1);
		CalendarPrinter.print(calendar);
		
	}
}
