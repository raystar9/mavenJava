package week4.day14.exam._02_clone2;

class Rectangle implements Cloneable {
	int _width, _height;

	Rectangle(int width, int height) {
		_width = width;
		_height = height;
	}

	@Override
	protected Rectangle clone() {
		try {
			return (Rectangle) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
