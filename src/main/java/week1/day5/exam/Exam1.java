package week1.day5.exam;

public class Exam1 {

	public static void main(String[] args) {
		
		int[] score = {95, 70, 80, 75, 100};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.println("score["+i+"] = " + score[i]);
		}
		System.out.println("Total score = " + sum);
		System.out.println("Average = "+(double)sum / score.length);
	}
}
