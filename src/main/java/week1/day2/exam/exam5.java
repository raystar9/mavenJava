package week1.day2.exam;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		sc.close();
		if(number % 3 == 0) {
			System.out.println(number + "��(��) 3�� ����Դϴ�.");
		}
		
		else {
			System.out.println(number + "��(��) 3�� ����� �ƴմϴ�.");
		}
	}
}
