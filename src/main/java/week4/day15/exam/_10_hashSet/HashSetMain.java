package week4.day15.exam._10_hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class HashSetMain {

	public static void main(String[] args) {
		Set hs = new HashSet();
		
		hs.add("Like");
		hs.add("Funny");
		
		hs.add(new Date());
		
		System.out.println("hs : " + hs);
		hs.remove("Funny");
		System.out.println("hs : " + hs);
		
		System.out.println("have \"Like\"? : " + hs.contains("Like"));
	}

}
