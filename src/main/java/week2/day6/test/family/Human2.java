package week2.day6.test.family;

public class Human2 {

	private String _name;
	private double _weight;
	private double _height;
	private int _age;
	
	public Human2(String name, double weight, double height, int age) {
		_name = name;
		_weight = weight;
		_height = height;
		_age = age;
	}
	
	public void eat() {
		System.out.println(_name + " eats");
		_weight++;
	}
	
	public void walk() {
		System.out.println(_name + " walks");
		_weight--;
	}
	
	public void wash() {
		System.out.println(_name + " washes");
	}
	
	public double getWeight() {
		return _weight;
	}
	
	public void printData() {
		System.out.println("name : " + _name);
		System.out.println("weight : " + _weight);
		System.out.println("height : " + _height);
		System.out.println("age : " + _age);
	}
}
