package week1.day3.exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String args[]) {
		
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first integer : ");
		num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Input operator : ");
		String operator = sc.nextLine();
		
		System.out.print("Input second integer : ");
		num2 = sc.nextInt();
		
		sc.close();
		switch (operator) {
		case "+" :
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			break;
		case "*" :
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			break;
		case "/" :
			System.out.printf("%d / %d = %.3f\n", num1, num2, (float)num1 / num2);
			break;
		default :
			System.out.println("Error!");
			break;
		
		}
	}
}
