package week1.day3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		int s;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input your score : ");
		s = sc.nextInt();
		sc.close();
		
		if(s < 0 || s > 100) {
			System.out.println("Error");
		} else if(s >= 90) {
			System.out.println("grade 'A'");
		} else if (s >= 80) {
			System.out.println("grade 'B'");
		} else if (s >= 70) {
			System.out.println("grade 'C'");
		} else if (s >= 60) {
			System.out.println("grade 'D'");
		} else {
			System.out.println("grade 'E'");
		}
	}
}
