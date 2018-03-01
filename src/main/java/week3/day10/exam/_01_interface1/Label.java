package week3.day10.exam._01_interface1;

public class Label implements Changeable {

	private String _text;
	private String _foreGround;
	private String _backGround;
	private String _font;
	private int _width;
	private int _height;
	
	public Label(String text, int width, int height, String foreGround, String backGround, String font) {
		_text = text;
		_foreGround = foreGround;
		_backGround = backGround;
		_font = font;
		_width = width;
		_height = height;
	}

	@Override
	public void resize(int width, int height) {
		_width = width;
		_height = height;
	}

	@Override
	public void setForeground(String color) {
		_foreGround = color;
	}

	@Override
	public void setBackground(String color) {
		_backGround = color;
	}

	@Override
	public void setFont(String font) {
		_font = font;
	}
	
	public String getText() {
		return _text;
	}

	public String getForeGround() {
		return _foreGround;
	}

	public String getBackGround() {
		return _backGround;
	}

	public String getFont() {
		return _font;
	}

	public int getWidth() {
		return _width;
	}

	public int getHeight() {
		return _height;
	}
}
