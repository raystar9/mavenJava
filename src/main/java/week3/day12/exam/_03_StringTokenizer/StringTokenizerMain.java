package week3.day12.exam._03_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Apple Mango Peach");
		/*System.out.println(st.countTokens());
		String s1 = st.nextToken();
		System.out.println(s1);
		String s2 = st.nextToken();
		System.out.println(s2);
		String s3 = st.nextToken();
		System.out.println(s3);*/
		/*//runtime error
		String s4 = st.nextToken();
		System.out.println(s4);*/
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
