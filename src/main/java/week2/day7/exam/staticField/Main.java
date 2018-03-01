package week2.day7.exam.staticField;

public class Main {

	public static void main(String[] args) {
		
		System.out.println();
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		acc1.accumulate(10);
		acc2.accumulate(20);
		System.out.println("acc1.total = " + acc1.getTotal());
		System.out.println("acc1.grandTotal = " + acc1.getGrandTotal());
		System.out.println("acc2.total = " + acc2.getTotal());
		System.out.println("acc2.grandTotal = " + acc2.getGrandTotal());
		
		System.out.println("Accumulator.grandTotal = " + Accumulator.getGrandTotal());
	}
}
