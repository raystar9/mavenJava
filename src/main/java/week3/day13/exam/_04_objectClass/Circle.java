package week3.day13.exam._04_objectClass;

class Circle {

	int _radius;
	Circle(int radius){
		_radius = radius;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle cir = (Circle)obj;
			return cir._radius == this._radius;
		}
		return false;
	}
}
