package week1.day3;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		System.out.print("Input a alphabet : ");
		Scanner sc = new Scanner(System.in);
		/*char imsi = sc.next().charAt(0);
		
		sc.close();
		switch (imsi) {
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'p':
		case 'P':
			System.out.println("Pear");
			break;
		case 'g':
		case 'G':
			System.out.println("Grape");
			break;
		default : System.out.println("?");
		}*/
		
		String imsi = sc.next();
		
		sc.close();
		switch (imsi) {
		case "a":
		case "A":
			System.out.println("Apple");
			break;
		case "p":
		case "P":
			System.out.println("Pear");
			break;
		case "g":
		case "G":
			System.out.println("Grape");
			break;
		default : System.out.println("?");
		}
	}
}
