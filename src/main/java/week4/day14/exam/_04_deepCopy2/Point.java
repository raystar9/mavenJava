package week4.day14.exam._04_deepCopy2;

class Point implements Cloneable{

	int _x, _y;

	public Point(int x, int y) {
		_x = x;
		_y = y;
	}

	@Override
	public String toString() {
		return "(" + _x + ", " + _y + ")";
	}
	
	@Override
	protected Point clone() {
		Point point = null;
		try {
			point = (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return point;
	}
}
