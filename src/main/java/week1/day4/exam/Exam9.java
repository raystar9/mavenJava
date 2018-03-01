package week1.day4.exam;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		
		int number1 = 0, number2 = 0;
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first number : ");
		number1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Input second number : ");
		number2 = sc.nextInt();
		
		sc.close();
		if(number1 < 1 || number2 < 1) {
			System.out.println("Input positive numbers.");
		} else {
			
			//solve by swap
			if(number1 > number2) {
				int temp = number2;
				number2 = number1;
				number1 = temp;
			}
			//solve by swap
			
			/*if(number1 < number2) {*/
				for(; number1<=number2; number1++) {
					answer += number1;
				}
			/*} else {
				for(; number2<=number1; number2++) {
					answer += number2;
				}
			}*/
			System.out.println(answer);
		}
	}
}
