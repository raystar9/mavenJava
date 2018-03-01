package week4.day14.exam._14_maxMin2;

import java.util.Scanner;

class TestMain {

	public static void main(String[] args) {
		String a, b;
		int max, min;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input two number : ");
		
		a = sc.next();
		b = sc.next();
		
		max = max(Integer.parseInt(a), Integer.parseInt(b));
		min = min(Integer.parseInt(a), Integer.parseInt(b));
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		sc.close();
	}
	public static int max(int a, int b) {
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	public static int min(int a, int b) {
		int min;
		if(a < b) {
			min = a;
		}else {
			min = b;
		}
		return min;
	}
}
