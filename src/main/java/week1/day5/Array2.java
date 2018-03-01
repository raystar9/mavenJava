package week1.day5;

public class Array2 {

	public static void main(String[] args) {
		
		int[] arr1;
		arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		
		int[] arr3 = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr["+i+"] = " + arr3[i]);
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr["+i+"] = " + arr3[i]);
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr["+i+"] = " + arr3[i]);
		}
		
	}
}
