package week1.day4;

public class For {

	public static void main(String[] args) {
		
		int answer = 0;
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + 1);
		}
		System.out.println("End");
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + 2);
		}
		System.out.println("End");
		
		answer = 0;
		for(int i = 0; i < 10; i++) {
			answer += i + 1;
		}
		System.out.println(answer);
		System.out.println("End");
		
		answer = 0;
		for(int i = 0; i < 10; i += 2) {
			answer += i + 1;
		}
		System.out.println(answer);
		System.out.println("End");
		
		answer = 0;
		for(int i = 0; i < 10; i += 2) {
			answer += i + 2;
		}
		System.out.println(answer);
		System.out.println("End");
	}
}
