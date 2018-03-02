package week4.day15.test.lottery;

import java.util.Set;
import java.util.TreeSet;

class Lotto {

	public static void main(String[] args) {
		Set<Integer> hs = new TreeSet<>();
		while(hs.size() < 6) {
			hs.add(pickNumber());
		}
		System.out.println(hs);
	}
	
	static int pickNumber() {
		return (int)(Math.random()*45 + 1);
	}

}
