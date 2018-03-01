package week2.day7.exam.physicalInfo;

public class PhysicalInfo {
	
	private String _name;
	private int _age;
	private float _height;
	private float _weight;
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		_age = age;
		_name = name;
		_height = height;
		_weight = weight;
	}
	
	public void update(int age){
		_age = age;
	}
	
	public void update(int age, float height) {
		this.update(age);
		_height = height;
	}
	
	public void update(int age, float height, float weight) {
		this.update(age, height);
		_weight = weight;
	}
	public String getName() {
		return _name;
	}
	
	public int getAge() {
		return _age;
	}
	
	public float getHeight() {
		return _height;
	}
	
	public float getWeight() {
		return _weight;
	}
}
