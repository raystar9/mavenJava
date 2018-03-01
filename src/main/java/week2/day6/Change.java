package week2.day6;

public class Change {

	public static void main(String[] args) {
		int[] ary = new int[2];
		ary[0] = 10;
		ary[1] = 20;
		System.out.println("ary[0] = " +ary[0]);
		System.out.println("ary[1] = " +ary[1]);
		change(ary);
		System.out.println("change method run.");
		System.out.println("ary[0] = " +ary[0]);
		System.out.println("ary[1] = " +ary[1]);
		
	}
	
	static void change(int[] ary) {
		int temp = ary[0];
		ary[0] = ary[1];
		ary[1] = temp;
	}
}
