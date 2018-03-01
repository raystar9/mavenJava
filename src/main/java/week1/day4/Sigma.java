package week1.day4;

public class Sigma {

	public static void main(String[] args) {
		
		int i = 0, answer = 0;
		int number = 12;
		
		while(i < number) {
			answer += ++i;
		}
		System.out.println(answer);
		
		i = 1;
		answer = 0;
		
		while(i <= number) {
			answer += i;
			i += 2;
		}
		System.out.println("sum of odds : " + answer);
		
		i = 2;
		answer = 0;
		while(i <= number) {
			answer += i;
			i += 2;
		}
		System.out.println("sum of evens : " + answer);
	}
}
