package week4.day14.exam._01_clone;

import java.util.GregorianCalendar;

class CloneMain {
	public static void main(String[] args) {
		
		GregorianCalendar cal1 = new GregorianCalendar(2007, 0, 1);
		
		GregorianCalendar cal2 = (GregorianCalendar) cal1.clone();
		
		System.out.printf("%tF %n", cal1);
		System.out.printf("%tF %n", cal2);
		
		cal1.set(2018, 1, 26);
		
		System.out.printf("%tF %n", cal1);
		System.out.printf("%tF %n", cal2);
		
	}
}
