package week3.day13.exam._06_objectEquals;

public class Rectangle {

	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return r.width == this.width && r.height == this.height;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Width : " + width + ", Height : " + height;
	}

	
}
