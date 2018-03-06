package week5.day19.practice._07_serialiVersion;

import java.io.Serializable;

class Rectangle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
	
	int _width, _height;

	public Rectangle(int width, int height) {
		_width = width;
		_height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + _width + ", height=" + _height + "]";
	}

	int getArea() {
		return _width * _height ;
	}
}
