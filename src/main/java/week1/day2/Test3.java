package week1.day2;

import java.util.Scanner;
import java.io.InputStream;

public class Test3 {

	public static void main(String[] args) {
		
		int ans = 0;
		InputStream is = System.in;
		
		Scanner sc = new Scanner(is);
		System.out.println("첫번째 값 입력 : ");
		int a = sc.nextInt();
		System.out.println("두번째 값 입력 : ");
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