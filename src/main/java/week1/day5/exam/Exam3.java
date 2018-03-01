package week1.day5.exam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 5 numbers : ");
		
		for(int i = 0; i < 5; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		max = data[0];
		min = data[0];
		for(int i = 0; i < data.length - 1; i++) {
			if(max < data[i + 1]) {
				max = data[i + 1];
			}
			if(min > data[i + 1]) {
				min = data[i + 1];	
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
