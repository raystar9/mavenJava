package week1.day3.exam;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {

		int limit = 0, listCount = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Input limit of pages : ");
		limit = sc.nextInt();
		System.out.print("Input number of lines : ");
		listCount = sc.nextInt();

		sc.close();
		System.out.println(--listCount / limit + 1 + " page needs");
	}
}
