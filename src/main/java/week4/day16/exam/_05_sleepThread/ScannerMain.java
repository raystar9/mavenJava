package week4.day16.exam._05_sleepThread;

import java.util.Scanner;

class ScannerMain {

	public static void main(String[] args) {
		Thread thread = new ScannerThread();
		thread.start();
		try {
			Thread.sleep(800);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Input anything : ");
		System.out.println("Input word is \'" + sc.nextLine() + "\'.");
		sc.close();
		
	}

}
