package week4.day14.exam._04_deepCopy2;

class CloneMain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(new Point(2,3), 3);
		Circle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1._p._x = 10;
		c1._p._y = 20;
		c1._r = 7;
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
