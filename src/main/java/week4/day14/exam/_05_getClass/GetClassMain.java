package week4.day14.exam._05_getClass;

class GetClassMain {

	public static void main(String[] args) {
		Point p = new Point(5, 10);
		
		Class c1 = p.getClass();
		Class c2 = Point.class;
		Class c3 = null;
		
		try {
			c3 = Class.forName("week4.day14.exam._05_getClass.Point");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.getName());
		System.out.println(c2.toGenericString());
	}

}
