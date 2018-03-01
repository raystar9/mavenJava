package week2.day6;

import java.util.Scanner;

/**
 * @author raystar
 *
 */
public class Method {
	public static void main(String[] args) {
		
		/*for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println("Hello, world!");
		for (int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
		System.out.println();*/
		
		printIterateln('*', 30);
		printIterateln('-', 30);
		System.out.println("Hello, World!");
		printIterateln('-', 30);
		Method.printIterateln('*', 30);
	}
	
	static void printIterate(char character, int iterate) {
		for (int i = 0; i < iterate; i++) {
			System.out.print(character);
		}
		return;
	}
	
	static void printIterateln(char character, int iterate) {
		printIterate(character, iterate);
		System.out.println();
		return;
	}
	
}
