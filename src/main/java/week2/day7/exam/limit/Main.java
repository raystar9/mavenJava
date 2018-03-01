package week2.day7.exam.limit;

public class Main {

	public static void main(String[] args) {
		
		Limit v = new Limit();
		v.setValue(200000);
		System.out.println(v._value);
		System.out.println(Limit.UPPER_LIMIT);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
