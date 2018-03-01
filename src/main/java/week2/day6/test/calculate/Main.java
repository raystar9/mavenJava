package week2.day6.test.calculate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println(abs(-105));
		System.out.println(abs(105));
		
		System.out.println("Input "+ numbers.length +" integers");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int[] result = maxMin(numbers);
		System.out.println("max = " + result[0]);
		System.out.println("min = " + result[1]);
		sc.close();
	}
	
	private static int abs(int number) {
		if(number < 0)
			return -number;
		else
			return number;
	}
	
	private static int[] maxMin(int[] numbers) {
		int[] result = new int[2];
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		result[0] = max;
		result[1] = min;
		return result;
	}
}
