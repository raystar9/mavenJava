package week2.day8.exam.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
