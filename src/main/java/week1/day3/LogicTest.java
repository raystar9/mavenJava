package week1.day3;

public class LogicTest {
	public static void main(String args[]) {
		
		int a = 10, b = 20;
		
		if(a >= 20 && ++b >= 20) {
			System.out.println("True" + b);
		}
		else {
			System.out.println("False");
		}
	}
}
