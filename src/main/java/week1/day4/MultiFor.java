package week1.day4;

public class MultiFor {

	public static void main(String[] args) {
		
		for(int k = 0; k < 2; k++) {
			for (int j = 0; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					if(j == 0) {
						System.out.print(" [ "+ (i + k*4) +" ]\t");
					}
					else {
					System.out.print((i + k*4) + "*" + j + "=" + (i + k*4)*j + "\t");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}