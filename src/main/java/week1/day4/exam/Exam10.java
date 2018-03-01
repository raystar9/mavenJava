package week1.day4.exam;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		int kor = 0, eng = 0, math = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		System.out.println("=====================================");
		
		System.out.printf("합계 : %d, 평균 : %.2f\n", kor + eng + math, (double)(kor + eng + math)/3);
		System.out.println("국어 평점\t영어 평점\t수학 평점");
		
		switch(kor / 10) {
		case 10 :
		case 9 : 
			System.out.print("A입니다.\t");
			break;
		case 8 : 
			System.out.print("B입니다.\t");
			break;
		case 7 :
			System.out.print("C입니다.\t");
			break;
		case 6 : 
			System.out.print("D입니다.\t");
			break;
		default :
			System.out.print("F입니다.\t");
		}
		switch(eng / 10) {
		case 10 :
		case 9 : 
			System.out.print("A입니다.\t");
			break;
		case 8 : 
			System.out.print("B입니다.\t");
			break;
		case 7 :
			System.out.print("C입니다.\t");
			break;
		case 6 : 
			System.out.print("D입니다.\t");
			break;
		default :
			System.out.print("F입니다.\t");
		}
		
		switch(math / 10) {
		case 10 :
		case 9 : 
			System.out.print("A입니다.\t");
			break;
		case 8 : 
			System.out.print("B입니다.\t");
			break;
		case 7 :
			System.out.print("C입니다.\t");
			break;
		case 6 : 
			System.out.print("D입니다.\t");
			break;
		default :
			System.out.print("F입니다.\t");
		}
		sc.close();
	}
}
