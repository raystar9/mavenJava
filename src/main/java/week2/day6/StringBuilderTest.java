package week2.day6;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Hello, world!");
		sb.deleteCharAt(1);
		sb.deleteCharAt(1);
		sb.insert(1,  "el");
		System.out.println(sb);
		
	}
}
