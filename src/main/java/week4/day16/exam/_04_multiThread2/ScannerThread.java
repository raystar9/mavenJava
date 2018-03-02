package week4.day16.exam._04_multiThread2;

import java.util.Scanner;

class ScannerThread extends Thread{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input anything : ");
		System.out.println("Input word is \'" + sc.nextLine() + "\'.");
		sc.close();
	}
	
}
