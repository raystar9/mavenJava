package week1.day3.exam;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		i = sc.nextInt();
		sc.close();
		System.out.println((--i / 10)*10 + 1);
	}
}
