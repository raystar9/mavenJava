package week1.day3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		number = sc.nextInt();
		sc.close();
		
		if(number >= 1 && number <= 10) {
			System.out.println("숫자가 1과 10 사이에 존재합니다.");
		}
		
		else {
			System.out.println("숫자가 1과 10 사이에 존재하지 않습니다.");
		}
	}
}
