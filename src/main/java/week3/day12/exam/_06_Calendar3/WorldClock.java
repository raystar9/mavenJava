package week3.day12.exam._06_Calendar3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class WorldClock {

	public static void main(String[] args) {
		Calendar gc = new GregorianCalendar();
		TimeZone timeZoneNY = TimeZone.getTimeZone("America/New_York");
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd (E) aa hh:mm");
		/*String[] sa = TimeZone.getAvailableIDs();
		for(String s : sa ) {
			System.out.println(s);
		}*/
		
		
		
		TimeZone timeZoneHK = TimeZone.getTimeZone("HongKong");
		TimeZone timeZoneParis = TimeZone.getTimeZone("Europe/Paris");

		df.setTimeZone(timeZoneNY);
		System.out.println("NewYork : " + df.format(gc.getTime()));
		df.setTimeZone(timeZoneHK);
		System.out.println("HongKong : " + df.format(gc.getTime()));
		df.setTimeZone(timeZoneParis);
		System.out.println("Paris : " + df.format(gc.getTime()));

	}

}
