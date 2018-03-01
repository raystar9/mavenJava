package week2.day6.human;

public class Main {

	public static void main(String[] args) {
		
		Human suzy = new Human("Suzy", 47, 168, 24);
		Human bogam = new Human("Bogam", 65, 182, 23);
		Human2 suzy2 = new Human2("Suzy", 47, 168, 24);
		Human2 bogam2 = new Human2("Bogam", 65, 182, 23);
		
		suzy.eat();
		bogam.wash();
		suzy.walk();
		
		System.out.println(suzy2.getWeight());	//eat makes weight heavier, walks makes weight lighter.
		suzy2.eat();
		System.out.println(suzy2.getWeight());
		suzy2.walk();
		System.out.println(suzy2.getWeight());
		bogam2.wash();
		suzy2.walk();
		
	}
}
