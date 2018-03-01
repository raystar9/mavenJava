package week2.day6.human;

public class Human {

	private String _name;
	private double _weight;
	private double _height;
	private int _age;
	
	public Human(String name, double weight, double height, int age) {
		_name = name;
		_weight = weight;
		_height = height;
		_age = age;
	}
	
	public void eat() {
		System.out.println("eats");
	}
	
	public void walk() {
		System.out.println("walks");
	}
	
	public void wash() {
		System.out.println("washes");
	}
	
	public void printData() {
		System.out.println("name : " + _name);
		System.out.println("weight : " + _weight);
		System.out.println("height : " + _height);
		System.out.println("age : " + _age);
	}
}
