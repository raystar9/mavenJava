package week3.day11.test.test2.geometry.common;

public class Polygon {
	public int _x[];
	public int _y[];
	
	protected Polygon(int vertexNum){
		_x = new int[vertexNum];
		_y = new int[vertexNum];
	}
	
	protected void setPoint(int index, int x, int y) {
		_x[index] = x;
		_y[index] = y;
	}
}
