package week1.day5;

public class Array {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[10];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

	}
}
