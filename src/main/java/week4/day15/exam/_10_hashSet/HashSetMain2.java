package week4.day15.exam._10_hashSet;

import java.util.HashSet;

class HashSetMain2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("Americano");
		hs.add("Espresso");
		hs.add("Cappuccino");
		
		System.out.println(hs.size());
		
		System.out.println("hs : " + hs);
		hs.remove("Funny");
		System.out.println("hs : " + hs);
		
		System.out.println("have \"Like\"? : " + hs.contains("Like"));
	}

}
