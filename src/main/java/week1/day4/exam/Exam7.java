package week1.day4.exam;

public class Exam7 {

	public static void main(String[] args) {
		
		int answer = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 5 == 0) {
				continue;
			}
			answer += i;
		}
		
		System.out.println(answer);
	}
}
