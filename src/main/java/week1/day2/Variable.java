package week1.day2;

public class Variable {

	public static void main(String[] args) {
		byte b = 10;
//		short s = 100;
		int i = 1000;
		
//		long l = 10000L;
		float ft = 3.14f;
		
		double d = 42.195d;
		
		b = 20;
		System.out.println("b = " + b);
		b += 300;
		System.out.println("b = " + b);
		
		System.out.println(i);
		System.out.println("f = "+ ft + ", d = " + d);
		
		char c1 = 'A';
		char c2 = '@';
		char c3 = '홍';
		
		System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);
		
		System.out.printf("%d\n", (int)c1);
		System.out.printf("%d\n", (int)c2);
		System.out.printf("%d\n", (int)c3);
		
		System.out.println(c1 + c2 + c3);
		System.out.println("" + c1 + c2 + c3);
		
		char c4 = 65;
		char c5 = '\uAC01';

		System.out.println(c4);
		System.out.println(c5);
		
		char c6 = 0101;
		char c7 = 0x41;
		System.out.println("8진수 0101 = " + c6 + "\n"
				+ "16진수 0x41 = " + c7);	
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1은 참인 " + b1);
		System.out.println("b2는 거짓인 " + b2);
		
		
		/*StringBuilder sb = new StringBuilder();
		
		sb.append(c1);
		sb.append(c2);
		sb.append(c3);
		
		System.out.println(sb);*/
		
	}
}
