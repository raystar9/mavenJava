package week2.day8.exam.accumulator;

public class Accumulator {

	private int total = 0;
	private static int grandTotal = 0;
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	public int getTotal() {
		return total;
	}
	
	public static int getGrandTotal() {
//		total = 5;
		return grandTotal;
	}
}
