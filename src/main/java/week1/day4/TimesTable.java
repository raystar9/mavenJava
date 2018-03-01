package week1.day4;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int number = sc.nextInt();
		System.out.println("[ " + number + " ]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + "*" +i + "=" + number * i);
		}
		
		System.out.println("Done");
		sc.close();
	}
}
