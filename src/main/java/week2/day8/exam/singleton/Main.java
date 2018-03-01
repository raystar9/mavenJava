package week2.day8.exam.singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = new Singleton();
		Singleton s3 = Singleton.getInstance();
		
		if(s1 == s3) {
			System.out.println("equal");
		} else
			System.out.println("not equal");
	}
}
