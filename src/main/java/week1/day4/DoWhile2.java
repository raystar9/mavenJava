package week1.day4;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String city = "";
		
		System.out.print("Input name of city : ");
		city = sc.nextLine();
		do {
			System.out.println("The city is " + city);
			city = sc.nextLine();
		} while(!city.equals("q"));
		
		System.out.println("End.");
		sc.close();
	}
}
