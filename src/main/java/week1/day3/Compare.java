package week1.day3;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > num2) {
			System.out.println("ù ���� �� ū ���Դϴ�.");
		}
		
		else if (num2 > num1) {
			System.out.println("�ι��� ���� �� ū ���Դϴ�.");
			
		}
		else {
			System.out.println("�� ���� ��ġ�մϴ�.");
		}
		
	}
}