package week3.day11.test.test2.geometry.shape;

import week3.day11.test.test2.geometry.common.Polygon;

public class Squire extends Polygon{
	
	
	public Squire(int x, int y, int distance) {
		super(4);
		setPoint(0, x, y);
		setPoint(1, x+distance, y);
		setPoint(2, x, y+distance);
		setPoint(3, x+distance, y+distance);
	}

	public int getX(int index) {
		return _x[index];
	}

	public int getY(int index) {
		return _y[index];
	}
}
