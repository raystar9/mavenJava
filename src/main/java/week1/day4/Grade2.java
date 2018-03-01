package week1.day4;

public class Grade2 {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		char grade = '\n';
		
		
		switch (i / 10) {
		case 10 :
			if(i == 100) {
				System.out.println("Grade A");
			} else {
				System.out.println("Error");
			}
			break;
		case 9 : 
			System.out.println("Grade A");
			break;
		
		case 8 :
			System.out.println("Grade B");
			break;
		
		case 7 :
			System.out.println("Grade C");
			break;
		
		case 6 :
			System.out.println("Grade D");
			break;
		
		case 5 :
		case 4 :
		case 3 :
		case 2 :
		case 1 :
		case 0 : 
			if(i >= 0) {
				System.out.println("Grade F");
			}
			else 
				System.out.println("Error");
			break;
		
		default : System.out.println("Error");
		}
		
	}
}
