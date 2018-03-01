package week1.day3;

import java.util.Scanner;

public class StringExtract {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String imsi = sc.next();
		sc.close();
		System.out.println("first character : " + imsi.charAt(0));
		System.out.println("second character : " + imsi.charAt(1));
		System.out.println("third character : " + imsi.charAt(2));
	}
}
