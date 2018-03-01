package week2.day8.exam.staticInit;

public class HundredNumbers {

	static int arr[];
	
	public HundredNumbers() {
		System.out.println("constructor");
	}
	
	static {
		System.out.println("== Initialization block ==");
		arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
			System.out.print(arr[i] + "\t");
			
		}
		System.out.println();
	}
}
