package week1.day4.exam;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		
		String city = "";
		Scanner sc = new Scanner(System.in);
		
		while(!city.equals("q")) {
			System.out.print("Input city name : ");
			city = sc.nextLine();
			switch(city) {
			case "seoul" :
				System.out.println("you're in seoul.");
				break;
			case "busan" :
				System.out.println("you're in busan.");
				break;
			case "daegu" :
				System.out.println("you're in daegu.");
				break;
			case "daejeon" :
				System.out.println("you're in daejeon.");
				break;
			case "jeju" :
				System.out.println("you're in jeju.");
				break;
			case "q" :
				break;
			default :
				System.out.println("not a city.");
			}
		}
		sc.close();
		System.out.println("quit.");
	}
}
