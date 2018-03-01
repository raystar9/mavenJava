package week1.day3.exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String in = sc.nextLine();
		sc.close();
		if(in.length() != 1) {
			System.out.println("please input a character.");
		} else {
		char c = in.charAt(0);
		int num = 0;
		
		num = (c >= 65 && c <= 90)? c + 32 : ((c >= 97 && c <= 122)? c - 32 : c);
		
		System.out.print(c + "=>");
		System.out.printf("%c", num);
		}
	}
}
