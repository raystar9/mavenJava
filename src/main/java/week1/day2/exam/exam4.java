package week1.day2.exam;

import java.io.InputStream;
import java.util.Scanner;

public class exam4 {

public static void main(String[] args) {
		
		int ans = 0;
		InputStream is = System.in;
		
		Scanner sc = new Scanner(is);
		System.out.println("ù��° �� �Է� : ");
		int a = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		int b = sc.nextInt();
		sc.close();
		
		
		ans = a + b;
		System.out.printf("%d + %d = %d\n", a, b, ans);
		ans = a - b;
		System.out.printf("%d - %d = %d\n", a, b, ans);
		ans = a * b;
		System.out.printf("%d * %d = %d\n", a, b, ans);
		ans = a / b;
		System.out.printf("%d / %d = %d\n", a, b, ans);
		ans = a % b;
		System.out.printf("%d %c %d = %d", a, '%', b, ans);
	}
}
