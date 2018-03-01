package week2.day8.exam.accumulator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println();
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		System.out.println("Accumulator.grandTotal = " + Accumulator.getGrandTotal());
		acc1.accumulate(10);
		acc2.accumulate(20);
		System.out.println("acc1.total = " + acc1.getTotal());
		System.out.println("acc2.total = " + acc2.getTotal());
		System.out.println("Accumulator.grandTotal = " + Accumulator.getGrandTotal());
	}
}
