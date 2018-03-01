package week3.day09.exam.interfaceExtend;

class Rectangle implements Transformable {

	private int _x;
	private int _y;
	private int _width;
	private int _height;
	
	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public int getWidth() {
		return _width;
	}

	public int getHeight() {
		return _height;
	}

	public Rectangle(int x, int y, int width, int height) {
		_x = x;
		_y = y;
		_width = width;
		_height = height;
	}

	@Override
	public void moveTo(int x, int y) {
		_x = x;
		_y = y;
	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		_x += xOffset;
		_y += yOffset;
	}

	@Override
	public void resize(int width, int height) {
		_width = width;
		_height = height;
	}

}
