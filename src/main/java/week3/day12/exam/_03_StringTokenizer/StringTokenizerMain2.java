package week3.day12.exam._03_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain2 {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Apple, Mango/Peach", ",/ ", true);
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
