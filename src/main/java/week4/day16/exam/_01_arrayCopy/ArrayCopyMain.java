package week4.day16.exam._01_arrayCopy;

class ArrayCopyMain {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char[] arr2 = { '1', '2', '3', '4', '5', '6', '7', '8' };
		char[] arr3 = new char[arr.length];
		
		System.arraycopy(arr, 3, arr2, 1, 3);
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		for (char c : arr2) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (char c : arr3) {
			System.out.print(c + " ");
		}

	}

}
