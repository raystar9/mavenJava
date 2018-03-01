package week4.day14.exam._13_autoBoxing;

class AutoBoxing {

	public static void main(String[] args) {
		printDouble(new Double(123.45));
		
		printDouble(123.45);
	}
	static void printDouble(Double number) {
		System.out.println("number = " + number);
		System.out.println("number.toString() = " + number.toString());
	}
}
