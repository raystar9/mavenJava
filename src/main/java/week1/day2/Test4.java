package week1.day2;

import java.io.InputStream;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		sc.close();
		
		if(n % 2 == 0) {
			System.out.println(n + "은 짝수입니다.");
		}
		else
			System.out.println(n + "은 홀수입니다.");
	}
}