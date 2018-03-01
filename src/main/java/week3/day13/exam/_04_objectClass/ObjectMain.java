package week3.day13.exam._04_objectClass;

import java.io.File;

class ObjectMain {

	public static void main(String[] args) {

		File file = new File("/home/");
		String str = file.toString(); // file.toString() uses overrided method
		System.out.println(str);

		Circle circle = new Circle(3);
		Circle circle2 = new Circle(3);
		System.out.println(circle.toString()); // circle.toString() uses object.java's method
		System.out.println(circle);
		System.out.println(circle2);

		if (circle.equals(circle2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		if (circle == circle2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
