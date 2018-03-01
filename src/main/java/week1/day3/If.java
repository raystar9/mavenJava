package week1.day3;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
		
		if(num2 > num1) {
			if(num3 > num2) {
				System.out.printf("%d이(가) 가장 큽니다.", num3);
				System.out.printf("%d이(가) 가장 작습니다", num1);
			} else {
				if(num1 > num3) {
					System.out.printf("%d이(가) 가장 큽니다.", num1);
					System.out.printf("%d이(가) 가장 작습니다", num2);
				} else {
					System.out.printf("%d이(가) 가장 큽니다.", num3);
					System.out.printf("%d이(가) 가장 작습니다", num2);
				}
			}
		} else {
			if(num2 > num3) {
				System.out.printf("%d이(가) 가장 큽니다.", num3);
				System.out.printf("%d이(가) 가장 작습니다", num1);
			} else {
				if(num1 > num3) {
					System.out.printf("%d이(가) 가장 큽니다.", num1);
					System.out.printf("%d이(가) 가장 작습니다", num2);
				} else {
					System.out.printf("%d이(가) 가장 큽니다.", num3);
					System.out.printf("%d이(가) 가장 작습니다", num2);
				}
			}
		}
	}
}
