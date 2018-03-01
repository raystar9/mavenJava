package week1.day4.exam;

public class Exam12 {

	public static void main(String[] args) {
		
		int r = 12;
		
		for (int j = 0; j < 2*r+1; j++) {
			for (int i = 0; i < 2*r+1; i++) {
				if(r*r >= (r-i)*(r-i) + (r-j)*(r-j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
