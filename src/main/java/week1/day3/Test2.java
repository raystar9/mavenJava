package week1.day3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		number = sc.nextInt();
		sc.close();
		
		if(number >= 1 && number <= 10) {
			System.out.println("���ڰ� 1�� 10 ���̿� �����մϴ�.");
		}
		
		else {
			System.out.println("���ڰ� 1�� 10 ���̿� �������� �ʽ��ϴ�.");
		}
	}
}
