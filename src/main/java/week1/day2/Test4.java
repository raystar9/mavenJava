package week1.day2;

import java.io.InputStream;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		sc.close();
		
		if(n % 2 == 0) {
			System.out.println(n + "�� ¦���Դϴ�.");
		}
		else
			System.out.println(n + "�� Ȧ���Դϴ�.");
	}
}