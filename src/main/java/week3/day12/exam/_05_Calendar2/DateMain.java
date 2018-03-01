package week3.day12.exam._05_Calendar2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		Date d = new Date();
		GregorianCalendar calendar = new GregorianCalendar();

//		System.out.println(d);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat2= new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat dateFormat3= new SimpleDateFormat("yyyy년 MM월 dd일 a h시 m분 s초 E요일");
//		System.out.println(dateFormat.format(d));
//		System.out.println(dateFormat2.format(d));
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
//		System.out.println(ts);
//		System.out.println(dateFormat3.format(ts));
		
		System.out.println(dateFormat.format(calendar.getTime()));
		System.out.println(dateFormat2.format(calendar.getTime()));
		System.out.println(dateFormat3.format(calendar.getTime()));
	}

}
