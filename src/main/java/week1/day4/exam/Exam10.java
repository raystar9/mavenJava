package week1.day4.exam;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		int kor = 0, eng = 0, math = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� : ");
		math = sc.nextInt();
		
		System.out.println("=====================================");
		
		System.out.printf("�հ� : %d, ��� : %.2f\n", kor + eng + math, (double)(kor + eng + math)/3);
		System.out.println("���� ����\t���� ����\t���� ����");
		
		switch(kor / 10) {
		case 10 :
		case 9 : 
			System.out.print("A�Դϴ�.\t");
			break;
		case 8 : 
			System.out.print("B�Դϴ�.\t");
			break;
		case 7 :
			System.out.print("C�Դϴ�.\t");
			break;
		case 6 : 
			System.out.print("D�Դϴ�.\t");
			break;
		default :
			System.out.print("F�Դϴ�.\t");
		}
		switch(eng / 10) {
		case 10 :
		case 9 : 
			System.out.print("A�Դϴ�.\t");
			break;
		case 8 : 
			System.out.print("B�Դϴ�.\t");
			break;
		case 7 :
			System.out.print("C�Դϴ�.\t");
			break;
		case 6 : 
			System.out.print("D�Դϴ�.\t");
			break;
		default :
			System.out.print("F�Դϴ�.\t");
		}
		
		switch(math / 10) {
		case 10 :
		case 9 : 
			System.out.print("A�Դϴ�.\t");
			break;
		case 8 : 
			System.out.print("B�Դϴ�.\t");
			break;
		case 7 :
			System.out.print("C�Դϴ�.\t");
			break;
		case 6 : 
			System.out.print("D�Դϴ�.\t");
			break;
		default :
			System.out.print("F�Դϴ�.\t");
		}
		sc.close();
	}
}
