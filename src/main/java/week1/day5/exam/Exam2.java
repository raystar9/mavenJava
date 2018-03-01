package week1.day5.exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input 5 integers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of array = " + sum);
		System.out.println("Average = " + (double)sum / numbers.length);
		
		sc.close();
		
	}
}
