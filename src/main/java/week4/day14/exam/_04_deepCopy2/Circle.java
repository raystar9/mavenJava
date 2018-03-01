package week4.day14.exam._04_deepCopy2;

class Circle implements Cloneable{

	Point _p;
	double _r;
	
	public Circle(Point point, double radius) {
		_p = point;
		_r = radius;
	}
	
	public String toString() {
		return "[p=" + _p + ", r=" + _r + "]";
	}

	@Override
	protected Circle clone() {
		Circle circle = null;
		try {
			circle = (Circle) super.clone();
			circle._p = _p.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return circle;
	}
	
	
}

