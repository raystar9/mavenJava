package week4.day14.exam._02_clone2;

class CloneMain {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(30, 10);
		
		Rectangle rect2 = rect1.clone();		//공변 타입 변환 : 오버라이딩시 리턴 타입을 자손 클래스타입으로 변경을 허용
		
		System.out.printf("rect1 : %d x %d\n", rect1._width, rect1._height);
		System.out.printf("rect2 : %d x %d\n", rect2._width, rect2._height);
		
		rect1._width = 100;
		rect1._height = 200;
		
		System.out.printf("rect1 : %d x %d\n", rect1._width, rect1._height);
		System.out.printf("rect2 : %d x %d\n", rect2._width, rect2._height);
	}

}
