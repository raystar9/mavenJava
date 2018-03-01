package week2.day7.exam.circle;

public class Circle {

	private final double PI = 3.141592;
	private double _radius;
	
	public Circle(double radius) {
		_radius = radius;
	}
	
	public double getRadius() {
		return _radius;
	}
	public double getArea() {
		return _radius*_radius*PI;
	}
}
