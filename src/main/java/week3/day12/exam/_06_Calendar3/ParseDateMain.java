package week3.day12.exam._06_Calendar3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDateMain {
	
	public static void main(String[] args) {
		
		String start = "2018-02-05";
		String end = "2018-08-14";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginDate = dateFormat.parse(start);
			Date endDate = dateFormat.parse(end);
			
			System.out.println(differenceTwoDate(beginDate.getTime(), endDate.getTime()) + "일 차이");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static long differenceTwoDate(long start, long end) {
		return (end - start)/86400000;
	}
}
