package week3.day13.exam._06_objectEquals;

public class EqualMain {

	public static void main(String[] args) {
		/*Calendar calendar = new GregorianCalendar();
		Calendar calendar2 = new GregorianCalendar();
		
		compares(calendar, calendar2);*/
	
		Rectangle r1 = new Rectangle(10, 30);
		Rectangle r2 = new Rectangle(10, 30);
		
		compares(r1, r2);
		System.out.println(r1);
		System.out.println(r2);
	}
	static void compares(Object obj1, Object obj2) {
		if(obj1.equals(obj2)) {
			System.out.println("r1.equals(r2) : equal");
		} else {
			System.out.println("r1.equals(r2) : not equal");						
		}
		if(obj1 == obj2) {
			System.out.println("r1 == r2 : equal");
		} else {
			System.out.println("r1 == r2 : not equal");			
		}
	}
}
