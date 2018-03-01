package week1.day3;

public class Logics {

	public static void main(String[] args) {
		
		boolean a = false, b = false;
		
		a = 4 > 3;
		b = 5 > 7;
		
		if(a && b) {
			System.out.println("a && b �� ��");
		}
		
		if(a || b) {
			System.out.println("a || b �� ��");
		}
		
		else {
			System.out.println("a || b �� ����");
		}
	}
}
