package week2.day6;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(add(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
	
	static int add(int number1, int number2) {
		return number1 + number2;
	}
}
