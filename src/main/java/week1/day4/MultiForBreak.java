package week1.day4;

public class MultiForBreak {

	public static void main(String[] args) {
		
		outerLoop :
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("("+ i + ", " + j +") " );
				if((i == 3)&&(j == 1))
//				break;
				break outerLoop;
			}
			System.out.println();
		}
	}
}
