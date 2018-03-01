package week4.day14.exam._01_clone;

class Rectangle implements Cloneable {
	int _width, _height;

	Rectangle(int width, int height) {
		_width = width;
		_height = height;
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
