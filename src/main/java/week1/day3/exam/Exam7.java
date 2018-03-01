package week1.day3.exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		int page = 0 , startPage = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input page number : ");
		page = sc.nextInt();
		sc.close();
		
		startPage = (--page / 10)*10 + 1;
		System.out.println("Start page is " + startPage + ".");
	}
}
