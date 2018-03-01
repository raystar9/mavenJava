package week1.day2;

public class Print {
	public static void main(String[] args) {
		/*
		System.out.println();
		System.out.println();
		*/
		System.out.println("출력 성공!");
		System.out.println(30);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println(true);
		System.out.println(false);
		System.out.println("문자열 출력");
		System.out.print("=====줄이 바뀌지 않음=====");
		System.out.println("test");
		
//		printf 및 % 사용
		System.out.printf("%s", "자바 출력");
		System.out.printf("%f", 42.195);
		System.out.println();
		System.out.printf("%.2f\n", 42.195);
		System.out.printf("%d\n", 42);
		System.out.printf("%c\n", 'A');
		
//		역슬래시 literal 사용
		System.out.printf("%c%s%c\n", '"', "호호", '"');
		System.out.println("\"호호\"");
		System.out.println("호호\t하하");
	}
}
