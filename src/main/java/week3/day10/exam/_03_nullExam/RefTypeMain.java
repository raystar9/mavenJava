package week3.day10.exam._03_nullExam;

public class RefTypeMain {
	public static void main(String[] args) {
		
		Point obj = null;
		
		try {
			System.out.println(obj.getX());
			System.out.println(obj.getY());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}	
	}
}