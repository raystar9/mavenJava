package week1.day2.exam;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		sc.close();
		if(number % 3 == 0) {
			System.out.println(number + "은(는) 3의 배수입니다.");
		}
		
		else {
			System.out.println(number + "은(는) 3의 배수가 아닙니다.");
		}
	}
}
