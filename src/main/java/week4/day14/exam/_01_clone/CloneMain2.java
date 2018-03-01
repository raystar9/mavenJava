package week4.day14.exam._01_clone;

public class CloneMain2 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(30, 10);
		
		Rectangle rect2 = (Rectangle) rect1.clone();
		
		System.out.printf("rect1 : %d x %d\n", rect1._width, rect1._height);
		System.out.printf("rect2 : %d x %d\n", rect2._width, rect2._height);
		
		rect1._width = 100;
		rect1._height = 200;
		
		System.out.printf("rect1 : %d x %d\n", rect1._width, rect1._height);
		System.out.printf("rect2 : %d x %d\n", rect2._width, rect2._height);
	}

}
