package week3.day12.exam._05_Calendar;

import java.util.Calendar;

class Today {
	String[] dayOfWeek = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
	
	public void print(Calendar c) {
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print(c.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "일 ");
		System.out.print(c.get(Calendar.HOUR_OF_DAY) + "시 ");
		System.out.print(c.get(Calendar.MINUTE) + "분 ");
		System.out.print(c.get(Calendar.SECOND) + "초 ");
		
		System.out.print(dayOfWeek[c.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("입니다.");
	}
}
