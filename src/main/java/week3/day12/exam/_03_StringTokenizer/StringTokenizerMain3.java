package week3.day12.exam._03_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain3 {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Apple:10:kor, Mango:3:philipin, Peach:1:us", ":, ", true);
		
		System.out.println("Name\tCount\tRegion");
		
		String token;
		while(st.hasMoreTokens()) {
			token = st.nextToken();
			switch(token) {
			case " " :
				break;
			case ":" :
				System.out.print("\t");
				break;
			case "," :
				System.out.println();
				break;
			default :
				System.out.print(token);
			}
		}
	}
}
