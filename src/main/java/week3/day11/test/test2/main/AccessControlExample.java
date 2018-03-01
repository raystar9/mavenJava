package week3.day11.test.test2.main;

import week3.day11.test.test2.geometry.shape.Squire;

class AccessControlExample {

	public static void main(String[] args) {
		Squire sq1 = new Squire(100, 200, 15);
		print(sq1);
	}
	
	static void print(Squire squire) {
		for(int i = 0; i < 4; i++) {
			System.out.printf("x[%d]=%d, x[%d]=%d\n", i, squire.getX(i), i, squire.getY(i));
		}
		for(int i = 0; i < 4; i++) {
			System.out.printf("(%d, %d)\n", squire.getX(i), squire.getY(i));
		}
	}
}
