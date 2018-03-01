package week1.day4.exam;

public class Exam1 {

	public static void main(String[] args) {
		
		int i = 0, answer = 0;
		
		i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while(i <= 10);
		System.out.println("Done!");
		
		i = 2;
		do {
			System.out.println(i);
			i += 2;
		} while(i <= 10);
		System.out.println("Done!");
		
		i = 0;
		answer = 0;
		do {
			answer += i++;
		} while(i <= 10);
		System.out.println(answer);
		System.out.println("Done!");
		
		i = 0;
		answer = 0;
		do {
			answer += i;
			i += 2;
		} while(i <= 10);
		System.out.println(answer);
		System.out.println("Done!");
		
		i = 1;
		answer = 0;
		do {
			answer += i;
			i += 2;
		} while(i <= 10);
		System.out.println(answer);
		System.out.println("Done!");
	}
}
