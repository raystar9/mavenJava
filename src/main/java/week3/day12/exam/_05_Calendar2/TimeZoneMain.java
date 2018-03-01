package week3.day12.exam._05_Calendar2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class TimeZoneMain {
	
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		c.setTimeZone(timeZone);
		
		System.out.println("런던의 현재 시각은");
		Today t = new Today();
		t.print(c);
	}
}
