package week3.day09.exam.interfaceExtend;

class Main {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(100, 200, 10, 10);
		
		printRectangle(rect1);
		rect1.moveTo(25, 35);
		printRectangle(rect1);
		rect1.moveBy(-5, -5);
		printRectangle(rect1);
		rect1.resize(30, 30);
		printRectangle(rect1);

	}
	static void printRectangle(Rectangle rect) {
		System.out.println("StartPoint : " + rect.getX() + "," + rect.getY());
		System.out.println("Size : " + rect.getWidth() + "x" + rect.getHeight());
	}

}
