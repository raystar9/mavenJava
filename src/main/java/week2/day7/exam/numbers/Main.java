package week2.day7.exam.numbers;

public class Main {

	public static void main(String[] args) {
		
		int[] numberArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Numbers no = new Numbers(numberArray);
		
		System.out.println("total = " + no.getTotal());
		System.out.printf("average = %.2f", no.getAverage());
	}
}
