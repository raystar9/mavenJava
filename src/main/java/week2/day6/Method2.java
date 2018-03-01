package week2.day6;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println(sigma(1, 10));
		System.out.println(sigma(1, 100));
		System.out.println(sigma(1, 1000));
	}

	private static int sigma(int startNumber, int endNumber) {
		int sum = 0;
		for(int i = startNumber; i <= endNumber; i++) {
			sum += i;
		}
		return sum;
	}
	
	
}
