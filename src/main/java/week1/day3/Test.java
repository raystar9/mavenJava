package week1.day3;

import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		
		int a = 0, b = 0, c = 0, max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		max = (a > b? (a > c? a : c) : (b > c? b : c));
		min = (a < b? (a < c? a : c) : (b < c? b : c));
		System.out.println("maximum of " + a + ", " + b + ", " + c + " is "+ max);
		System.out.println("minimum of " + a + ", " + b + ", " + c + " is "+ min);
	}
}
