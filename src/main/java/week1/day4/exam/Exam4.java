package week1.day4.exam;

public class Exam4 {

	public static void main(String[] args) {
		
		int length = 5;
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length*2 + 1; i++) {
				if(i < (length - j)){
					System.out.print(" ");
				}
				else if(i < length + j + 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
