package week1.day4.exam;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է��� �ּ��� : ");
		number = sc.nextInt();
		
		sc.close();
		System.out.println(number + "�� �����");
		for (int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
	}
}
