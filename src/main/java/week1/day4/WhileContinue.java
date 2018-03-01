package week1.day4;

public class WhileContinue {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 10) {
			i++;
			if(i == 5)
				continue;
			System.out.println(i);
		}
	}
}
