package week2.day6.exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 5 integers : ");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		System.out.println("max : " + max(data));
		System.out.println("max : " + min(data));
		sc.close();
	}
	
	static int max(int[] ary) {
		int max = ary[0];
		for (int i = 1; i < ary.length; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		return max;
	}
	
	static int min(int[] ary) {
		int min = ary[0];
		for (int i = 1; i < ary.length; i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		return min;
	}
}
